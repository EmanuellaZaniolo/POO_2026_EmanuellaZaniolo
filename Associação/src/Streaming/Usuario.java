package Streaming;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private List<Perfil> perfis;

    public Usuario(String nome) {
        this.nome = nome;
        this.perfis = new ArrayList<>();
    }

    public void adicionarPerfil(String nomePerfil) {
        perfis.add(new Perfil(nomePerfil));
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public String getNome() {
        return nome;
    }
}