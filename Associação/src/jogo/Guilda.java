package jogo;

import java.util.ArrayList;
import java.util.List;

public class Guilda {

    private String nome;
    private List<Personagem> membros;

    public Guilda(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
        personagem.entrarGuilda(this);
    }

    public List<Personagem> getMembros() {
        return membros;
    }

    public String getNome() {
        return nome;
    }
}
