package jogo;
public class Jogador {

    private String nome;
    private Inventario inventario;
    private Guilda guilda;

    public Jogador(String nome) {
        this.nome = nome;
        this.inventario = new Inventario();
    }

    public String getNome() {
        return nome;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void entrarGuilda(Guilda guilda) {
        this.guilda = guilda;
    }

    public Guilda getGuilda() {
        return guilda;
    }
}
