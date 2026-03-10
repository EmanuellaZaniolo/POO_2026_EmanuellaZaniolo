package Xadrez;
public class Cavalo extends Peca {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cavalo(String cor){
        super("Cavalo",cor);
    }
    @Override
    public void mover(String posicaoDestino){
        System.out.println();
    }
}
