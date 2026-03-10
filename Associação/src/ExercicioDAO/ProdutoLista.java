package ExercicioDAO;

import java.util.ArrayList;

public class ProdutoLista implements ProdutoDAO {
    ArrayList<Produto>produtos;

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
