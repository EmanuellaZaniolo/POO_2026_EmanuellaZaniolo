package herança;
public class Cachorro extends Animal{
    public Cachorro (String nome){
        super(nome);
    }
    @Override
    //sobrescrita de método
    public void emimirSom(){
        System.out.println("auau");
    }
}
