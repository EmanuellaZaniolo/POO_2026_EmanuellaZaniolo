package exercicios.fornecedor;
import java.util.Scanner;

public class Main {

    public static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("cadastro cliete");
        System.out.print("CPF: ");
        String cpf = lerString();

        System.out.print("nome: ");
        String nome = lerString();

        System.out.print("email: ");
        String email = lerString();

        Cliente cliente = new Cliente(cpf, nome, email);

        System.out.println("cadastro do fornecedor");
        System.out.print("CNPJ: ");
        String cnpj = lerString();

        System.out.print("nome do fornecedor: ");
        String nomeFornecedor = lerString();

        System.out.print("telefone: ");
        String telefone = lerString();

        Fornecedor fornecedor = new Fornecedor(cnpj, nomeFornecedor, telefone);

        Pedido pedido = new Pedido(1, "23/03/2026");

        System.out.print("Quantos produtos deseja adicionar? ");
        int quantidade = lerInteiro();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Produto " + (i + 1));

            System.out.print("ID: ");
            int id = lerInteiro();

            System.out.print("Nome: ");
            String nomeProduto = lerString();

            System.out.print("Preço: ");
            double preco = lerDouble();

            Produto produto = new Produto(id, nomeProduto, preco, fornecedor);
            pedido.adicionarProduto(produto);
        }

        pedido.gerarNotaFiscal("NotaFiscal001");
        cliente.adicionarPedido(pedido);

        System.out.println("PEDIDOS DO CLIENTE");

        for (Pedido p : cliente.getPedidos()) {

            System.out.println("Pedido: " + p.getNumero());

            for (Produto prod : p.getProdutos()) {
                System.out.println("Produto: " + prod.getNome());
                System.out.println("Fornecedor: " + prod.getFornecedor().getNome());
            }

            System.out.println("Nota Fiscal: " + p.getNotaFiscal().getNumero());
            System.out.println("Valor Total: " + p.getNotaFiscal().getValorTotal());
        }
    }
   public static int lerInteiro() {
        int valor = LER.nextInt();
        LER.nextLine();
        return valor;
    }

    public static double lerDouble() {
        double valor = LER.nextDouble();
        LER.nextLine();
        return valor;
    }

    public static String lerString() {
        String valor = LER.nextLine();
        return valor;
    }
}