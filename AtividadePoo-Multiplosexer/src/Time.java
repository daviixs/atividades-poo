import java.util.ArrayList;
import java.util.List;

public class Time {
    private final int id;
    private final String nome;
    private final String tecnico;
    private final List<Atleta> atletas;

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    public void contratarAtleta(Atleta atleta) {
        if (atleta != null) {
            atletas.add(atleta);
        }
    }

    public List<Atleta> getAtletas() {
        return new ArrayList<>(atletas);
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", atletas=" + atletas +
                '}';
    }
}
