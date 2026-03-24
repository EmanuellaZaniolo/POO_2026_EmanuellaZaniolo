package exercicios.fornecedor;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private Fornecedor fornecedor;

    public Produto(int id, String nome, double preco, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
}