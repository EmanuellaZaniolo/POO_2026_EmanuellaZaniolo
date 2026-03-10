package ExercicioDAO;

import java.util.ArrayList;

public class ProdutoLista implements ProdutoDAO {

    ArrayList produtos = new ArrayList<>();

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public ArrayList listar() {
        return produtos;
    }

    @Override
    public ArrayList add() {
        return produtos;
    }

    @Override
    public ArrayList remove() {
        return produtos;
    }
}
