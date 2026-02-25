package herança;
public class Gato extends Animal{
    private boolean fivFelv;
    private String nome;
    public Gato(){
        this.nome= nome;
        this.fivFelv = fivFelv;
    }
    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }
}