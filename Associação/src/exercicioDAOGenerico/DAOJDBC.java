package exercicioDAOGenerico;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOJDBC<T> implements DAOG<T> {

    private Connection connection;
    private Class<T> clazz;
    private String tabela;

    public DAOJDBC(Connection connection, Class<T> clazz) {
        this.connection = connection;
        this.clazz = clazz;
        this.tabela = clazz.getSimpleName().toLowerCase();
    }

    @Override
    public void inserir(T obj) {
        try {
            Field[] fields = clazz.getDeclaredFields();

            StringBuilder sql = new StringBuilder("INSERT INTO " + tabela + " (");
            StringBuilder values = new StringBuilder(" VALUES (");

            for (Field f : fields) {
                sql.append(f.getName()).append(",");
                values.append("?,");
            }

            sql.deleteCharAt(sql.length() - 1).append(")");
            values.deleteCharAt(values.length() - 1).append(")");

            sql.append(values);

            PreparedStatement stmt = connection.prepareStatement(sql.toString());

            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                stmt.setObject(i + 1, fields[i].get(obj));
            }

            stmt.executeUpdate();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> listar() {
        List<T> lista = new ArrayList<>();

        try {
            String sql = "SELECT * FROM " + tabela;
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                T obj = clazz.getDeclaredConstructor().newInstance();

                Field[] fields = clazz.getDeclaredFields();

                for (Field f : fields) {
                    f.setAccessible(true);
                    Object valor = rs.getObject(f.getName());

                    // Tratamento simples para double
                    if (f.getType() == double.class && valor instanceof Number) {
                        f.set(obj, ((Number) valor).doubleValue());
                    } else {
                        f.set(obj, valor);
                    }
                }

                lista.add(obj);
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public T buscarPorId(Object id) {
        try {
            String sql = "SELECT * FROM " + tabela + " WHERE codigo = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setObject(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                T obj = clazz.getDeclaredConstructor().newInstance();
                Field[] fields = clazz.getDeclaredFields();

                for (Field f : fields) {
                    f.setAccessible(true);
                    Object valor = rs.getObject(f.getName());

                    if (f.getType() == double.class && valor instanceof Number) {
                        f.set(obj, ((Number) valor).doubleValue());
                    } else {
                        f.set(obj, valor);
                    }
                }

                rs.close();
                stmt.close();
                return obj;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void removerPorId(Object id) {
        try {
            String sql = "DELETE FROM " + tabela + " WHERE codigo = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setObject(1, id);
            stmt.executeUpdate();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}