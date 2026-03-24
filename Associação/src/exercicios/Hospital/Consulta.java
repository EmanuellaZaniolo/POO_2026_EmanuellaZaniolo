package exercicios.Hospital;

public class Consulta {

    private String data;
    private Medico medico;
    private Prontuario prontuario;

    public Consulta(String data, Medico medico, String descricaoProntuario) {
        this.data = data;
        this.medico = medico;
        this.prontuario = new Prontuario(descricaoProntuario);
    }

    public String getData() {
        return data;
    }

    public Medico getMedico() {
        return medico;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
}