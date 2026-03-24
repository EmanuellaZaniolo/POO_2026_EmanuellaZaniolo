package ExercicioDAO;

public class Main {
    public static void main(String[] args) {

       
        ProdutoDAO dao = new ProdutoLista();
    

        // Inserir produtos
        dao.inserir(new Produto("1", "Notebook", 3500));
        dao.inserir(new Produto("2", "Mouse", 50));

        // Listar produtos
        System.out.println("Lista de produtos:");
        for (Produto p : dao.listar()) {
            System.out.println(p);
        }

        // Buscar produto
        System.out.println("\nBuscando produto código 1:");
        System.out.println(dao.buscarPorId("1"));

        // Remover produto
        dao.remover("1");

        // Listar novamente
        System.out.println("\nLista após remoção:");
        for (Produto p : dao.listar()) {
            System.out.println(p);
        }
    }
}