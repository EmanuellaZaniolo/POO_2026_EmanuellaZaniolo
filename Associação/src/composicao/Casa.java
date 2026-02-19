package composicao;

public class Casa {
    private Comodo quarto;
    private Comodo cozinha;
    private Comodo sala;
    private Comodo lavabo;
    private Comodo banheiro;
    public Casa(){
        this.quarto =  new Comodo ("quarto");
        this.cozinha =  new Comodo ("cozinha");
        this.sala =  new Comodo ("sala");
        this.lavabo =  new Comodo ("lavabo");
        this.banheiro =  new Comodo ("banheiro");
    }
    public Comodo getBanheiro() {
        return banheiro;
    }
    public void setBanheiro(Comodo banheiro) {
        this.banheiro = banheiro;
    }
    public Comodo getQuarto() {
        return quarto;
    }
    public void setQuarto(Comodo quarto) {
        this.quarto = quarto;
    }
    public Comodo getCozinha() {
        return cozinha;
    }
    public void setCozinha(Comodo cozinha) {
        this.cozinha = cozinha;
    }
    public Comodo getSala() {
        return sala;
    }
    public void setSala(Comodo sala) {
        this.sala = sala;
    }
    public Comodo getLavabo() {
        return lavabo;
    }
    public void setLavabo(Comodo lavabo) {
        this.lavabo = lavabo;
    }
  public void mostrarComodos() {
        System.out.println("Cômodos da casa:");
        System.out.println(cozinha.getNome());
        System.out.println(sala.getNome());
        System.out.println(quarto.getNome());
        System.out.println(lavabo.getNome());
        System.out.println(banheiro.getNome());
    }
}
