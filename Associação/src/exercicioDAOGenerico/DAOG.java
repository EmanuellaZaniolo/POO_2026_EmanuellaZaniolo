package exercicioDAOGenerico;

import java.util.List;

public interface DAOG<T> {

    void inserir(T obj);

    List<T> listar();

    T buscarPorId(Object id);

    void removerPorId(Object id);
}