package exercicios.Hospital;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nome;
    private List<Medico> medicos;
    private List<Paciente> pacientes;

    public Hospital(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}