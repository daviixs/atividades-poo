public class Computador {
    private final int id;
    private final String marca;
    private final Processador processador;

    public Computador(int id, String marca, String marcaProcessador, String modeloProcessador, double frequenciaProcessador) {
        this.id = id;
        this.marca = marca;
        this.processador = new Processador(marcaProcessador, modeloProcessador, frequenciaProcessador);
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public Processador getProcessador() {
        return processador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", processador=" + processador +
                '}';
    }
}
