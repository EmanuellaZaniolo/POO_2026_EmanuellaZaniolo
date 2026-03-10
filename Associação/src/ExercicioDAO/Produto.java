package ExercicioDAO;

public class Produto {
    private String codigo;
    private String descicao;
    private double valor;
    public Produto(String codigo, String descicao, double valor) {
        this.codigo = codigo;
        this.descicao = descicao;
        this.valor = valor;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescicao() {
        return descicao;
    }
    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
