package exercicioDAOGenerico;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class DAOlistaG<T> implements DAOG<T> {

    private List<T> dados = new ArrayList<>();

    @Override
    public void inserir(T obj) {
        dados.add(obj);
    }

    @Override
    public List<T> listar() {
        return dados;
    }

    @Override
    public T buscarPorId(Object id) {
        try {
            for (T obj : dados) {
                Field f = obj.getClass().getDeclaredField("codigo");
                f.setAccessible(true);

                if (f.get(obj).equals(id)) {
                    return obj;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void removerPorId(Object id) {
        try {
            dados.removeIf(obj -> {
                try {
                    Field f = obj.getClass().getDeclaredField("codigo");
                    f.setAccessible(true);
                    return f.get(obj).equals(id);
                } catch (Exception e) {
                    return false;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}