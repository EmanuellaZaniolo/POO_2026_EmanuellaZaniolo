package exercicios.fornecedor;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String cpf;
    private String nome;
    private String email;
    private List<Pedido> pedidos;

    public Cliente(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }
}