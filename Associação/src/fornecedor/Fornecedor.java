package fornecedor;

public class Fornecedor {

    private String cnpj;
    private String nome;
    private String telefone;

    public Fornecedor(String cnpj, String nome, String telefone) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
}
