package exercicioDAO;

import java.util.ArrayList;
import java.util.List;

public class ProdutoLista implements ProdutoDAO {

    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void inserir(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public List<Produto> listar() {
        return produtos;
    }

    @Override
    public Produto buscarPorId(String codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void remover(String codigo) {
        produtos.removeIf(p -> p.getCodigo().equals(codigo));
    }
}