package fornecedor;

public class NotaFiscal {

    private String numero;
    private double valorTotal;

    public NotaFiscal(String numero, double valorTotal) {
        this.numero = numero;
        this.valorTotal = valorTotal;
    }

    public String getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}