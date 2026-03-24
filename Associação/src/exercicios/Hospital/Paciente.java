package exercicios.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private String nome;
    private List<Consulta> consultas;

    public Paciente(String nome) {
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public String getNome() {
        return nome;
    }
}