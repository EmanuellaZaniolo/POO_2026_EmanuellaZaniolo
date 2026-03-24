package exercicios.uber;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {

    private String nome;
    private List<Corrida> corridas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.corridas = new ArrayList<>();
    }

    public void adicionarCorrida(Corrida corrida) {
        corridas.add(corrida);
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }
}