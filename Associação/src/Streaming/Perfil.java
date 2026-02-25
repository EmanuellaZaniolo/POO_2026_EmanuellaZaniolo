package Streaming;
import java.util.ArrayList;
import java.util.List;

public class Perfil {

    private String nome;
    private List<Conteudo> historico;

    public Perfil(String nome) {
        this.nome = nome;
        this.historico = new ArrayList<>();
    }

    public void assistirConteudo(Conteudo conteudo) {
        historico.add(conteudo);
    }

    public List<Conteudo> getHistorico() {
        return historico;
    }

    public String getNome() {
        return nome;
    }
}