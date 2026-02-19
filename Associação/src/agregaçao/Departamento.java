package agregaçao;

import java.util.LinkedList;

public class Departamento {
    private String nome;
    private LinkedList<Funcionario> funcionarios;
    public Departamento(String nome, LinkedList<Funcionario>funcionarios){
        this.nome = nome;
        this.funcionarios= new LinkedList<Funcionarios>getFuncionarios();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LinkedList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(LinkedList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
