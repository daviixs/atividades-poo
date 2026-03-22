import java.util.ArrayList;
import java.util.List;

public class Edificio {
    private final String nome;
    private final String endereco;
    private final List<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void construirApartamento(int numero, int andar) {
        apartamentos.add(new Apartamento(numero, andar));
    }

    public List<Apartamento> getApartamentos() {
        return new ArrayList<>(apartamentos);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
