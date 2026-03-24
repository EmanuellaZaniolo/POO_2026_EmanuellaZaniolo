package ingresso;

public class Inferior extends Ingresso {

    private String localizacao;

    public Inferior(double valor, String localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println("Localização: " + localizacao);
    }
}