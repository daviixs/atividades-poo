import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private final int id;
    private final LocalDateTime horario;
    private final int sala;
    private Filme filme;
    private final List<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public void vincularFilme(Filme filme) {
        this.filme = filme;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        StringBuilder builder = new StringBuilder();
        builder.append("Sessao ").append(id)
                .append(" - Sala ").append(sala)
                .append(" - Horario ").append(horario.format(formatter))
                .append("\nFilme: ").append(filme != null ? filme.getTitulo() : "Nenhum filme vinculado")
                .append("\nIngressos:");
        for (Ingresso ingresso : ingressos) {
            builder.append("\n - ").append(ingresso);
        }
        return builder.toString();
    }
}
