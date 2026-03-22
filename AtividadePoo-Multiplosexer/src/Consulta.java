import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private final LocalDateTime data;
    private final double valorDaConsulta;
    private final Medico medico;
    private final Paciente paciente;

    public Consulta(LocalDateTime data, double valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        this.valorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Consulta{" +
                "data=" + data.format(formatter) +
                ", valorDaConsulta=" + valorDaConsulta +
                ", medico=" + medico.getNome() +
                ", paciente=" + paciente.getNome() +
                '}';
    }
}
