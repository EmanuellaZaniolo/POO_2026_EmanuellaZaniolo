package exercicios.Streaming;

public abstract class Conteudo {

    private String titulo;

    public Conteudo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}