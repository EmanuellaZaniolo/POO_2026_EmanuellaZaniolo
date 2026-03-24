package ingresso;

public class Camarote extends Vip {

    private String localizacao;

    public Camarote(double valor, double taxaVIP, String localizacao) {
        super(valor, taxaVIP);
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }

    public void mostrarValores() {
        System.out.println("Valor base: " + valor);
        System.out.println("Taxa VIP: " + taxaVIP);
        System.out.println("Total: " + getValorVIP());
    }
}