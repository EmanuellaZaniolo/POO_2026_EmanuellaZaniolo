package exercicios.Streaming;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Conteudo {

    private Diretor diretor;
    private List<Ator> elenco;

    public Filme(String titulo, Diretor diretor) {
        super(titulo);
        this.diretor = diretor;
        this.elenco = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator) {
        elenco.add(ator);
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public List<Ator> getElenco() {
        return elenco;
    }
}