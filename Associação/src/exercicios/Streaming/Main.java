package exercicios.Streaming;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Manu");
        usuario.adicionarPerfil("Perfil Principal");

        Diretor diretor = new Diretor("Christopher Nolan");

        Ator ator1 = new Ator("Leonardo DiCaprio");
        Ator ator2 = new Ator("Joseph Gordon-Levitt");

        Filme filme = new Filme("A Origem", diretor);
        filme.adicionarAtor(ator1);
        filme.adicionarAtor(ator2);

        Perfil perfil = usuario.getPerfis().get(0);
        perfil.assistirConteudo(filme);

        System.out.println("Perfis do usuário:");
        for (Perfil p : usuario.getPerfis()) {
            System.out.println(p.getNome());
        }

        System.out.println("\nConteúdos assistidos:");
        for (Conteudo c : perfil.getHistorico()) {
            System.out.println(c.getTitulo());
        }

        System.out.println("\nElenco do filme:");
        for (Ator a : filme.getElenco()) {
            System.out.println(a.getNome());
        }
    }
}