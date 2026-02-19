package agregaçao;

public class Main {
    public static void main(String[] args) {
        Departamento mkt = new Departamento("Marketing");
        Funcionario f1 = new Funcionario("Luke");
        Funcionario f2 = new Funcionario("Kitana");
        mkt.alocaFuncionario(f2);
        mkt.alocaFuncionario(f1);
    }
}
