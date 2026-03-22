import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Projeto {
    private final int id;
    private final String nomeProjeto;
    private final List<Programador> programadores;

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>();
    }

    public void adicionarProgramador(Programador programador) {
        if (programador != null) {
            programadores.add(programador);
        }
    }

    public List<Programador> getProgramadores() {
        return new ArrayList<>(programadores);
    }

    public String listarProgramadores() {
        if (programadores.isEmpty()) {
            return "Nenhum programador alocado.";
        }
        return programadores.stream()
                .map(Programador::toString)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", totalProgramadores=" + programadores.size() +
                '}';
    }
}
