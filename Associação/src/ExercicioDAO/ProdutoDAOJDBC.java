package ExercicioDAO;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOJDBC implements ProdutoDAO {

    @Override
    public void inserir(Produto produto) {
        System.out.println("Inserindo no banco: " + produto);
    }

    @Override
    public List<Produto> listar() {
        System.out.println("Listando do banco...");
        return new ArrayList<>();
    }

    @Override
    public Produto buscarPorId(String codigo) {
        System.out.println("Buscando no banco código: " + codigo);
        return null;
    }

    @Override
    public void remover(String codigo) {
        System.out.println("Removendo do banco código: " + codigo);
    }
}