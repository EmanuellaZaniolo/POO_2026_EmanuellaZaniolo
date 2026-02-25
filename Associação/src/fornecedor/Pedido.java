package fornecedor;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private String data;
    private List<Produto> produtos;
    private NotaFiscal notaFiscal;

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void gerarNotaFiscal(String numeroNota) {
        double total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        this.notaFiscal = new NotaFiscal(numeroNota, total);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public int getNumero() {
        return numero;
    }
}