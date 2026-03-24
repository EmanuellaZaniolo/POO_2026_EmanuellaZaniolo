package exercicioDAO;

import java.util.List;

public interface ProdutoDAO {

    void inserir(Produto produto);

    List<Produto> listar();

    Produto buscarPorId(String codigo);

    void remover(String codigo);
}