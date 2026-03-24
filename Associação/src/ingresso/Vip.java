package ingresso;

public class Vip extends Ingresso {

    protected double taxaVIP;

    public Vip(double valor, double taxaVIP) {
        super(valor);
        this.taxaVIP = taxaVIP;
    }

    public double getValorVIP() {
        return valor + taxaVIP;
    }

    public void mostrarTaxaVIP() {
        System.out.println("Taxa VIP: " + taxaVIP);
    }
}