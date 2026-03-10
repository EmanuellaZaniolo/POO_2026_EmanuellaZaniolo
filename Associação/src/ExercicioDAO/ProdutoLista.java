package ExercicioDAO;

import java.util.ArrayList;

public class ProdutoLista implements ProdutoDAO {

    ArrayList <Produto>produtos = new ArrayList<Produto>();

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void listar(Produto prod) {
        for (Produto prod2 : produtos) {
            System.out.println(prod2);
        }
    }

    @Override
    public ArrayList add(Produto prod) {
        this.produtos.add(prod);
        return produtos;
    }

    @Override
    public ArrayList remove(Produto prod) {
        this.produtos.remove(prod);
        return produtos;
    }
}
