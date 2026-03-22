import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        Medico medico = new Medico(1, "Dra. Ana Silva", "Cardiologia");
        Paciente paciente = new Paciente(1, "Carlos Souza", "123.456.789-00");

        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 0);
        Consulta consulta = new Consulta(dataConsulta, 350.0, medico, paciente);

        System.out.println("Consulta registrada:");
        System.out.println(consulta);
    }
}
