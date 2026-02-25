package jogo;
public class Item {

    private String nome;
    private boolean equipado;

    public Item(String nome, boolean equipado) {
        this.nome = nome;
        this.equipado = equipado;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEquipado() {
        return equipado;
    }
}