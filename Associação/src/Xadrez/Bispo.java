package Xadrez;
public class Bispo extends Peca {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Bispo(String cor){
        super("Bispo",cor);
    }
    @Override
    public void mover (String posicaoDestino){
        System.out.println();
    }

}
