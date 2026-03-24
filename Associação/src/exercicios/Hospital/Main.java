package exercicios.Hospital;

public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("Hospital Central");

        Medico medico1 = new Medico("Dr. João", "Cardiologia");
        Medico medico2 = new Medico("Dra. Ana", "Pediatria");

        hospital.adicionarMedico(medico1);
        hospital.adicionarMedico(medico2);

        Paciente paciente = new Paciente("Carlos");
        hospital.adicionarPaciente(paciente);

        Consulta consulta1 = new Consulta("10/03/2026", medico1, "Paciente com pressão alta.");
        Consulta consulta2 = new Consulta("15/03/2026", medico2, "Retorno para avaliação.");

        paciente.adicionarConsulta(consulta1);
        paciente.adicionarConsulta(consulta2);

        // 🔹 Listar consultas do paciente
        System.out.println("Consultas do paciente " + paciente.getNome() + ":");

        for (Consulta c : paciente.getConsultas()) {
            System.out.println("Data: " + c.getData());
            System.out.println("Médico: " + c.getMedico().getNome());
            System.out.println("Prontuário: " + c.getProntuario().getDescricao());
            System.out.println("-------------------------");
        }
    }
}
