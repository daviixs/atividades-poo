public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
        this.marca = "Generico";
        this.modelo = "Standard";
        this.temperatura = 24;
        this.ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperaturaInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = 24;
        this.ligado = false;
        setTemperatura(temperaturaInicial);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura < 16 || temperatura > 30) {
            System.out.println("Erro: temperatura invalida. Use valores entre 16C e 30C.");
            return;
        }
        this.temperatura = temperatura;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    public void ajustarTemperatura(int novaTemp) {
        if (!ligado) {
            System.out.println("Nao e possivel ajustar a temperatura com o aparelho desligado.");
            return;
        }
        setTemperatura(novaTemp);
    }

    public void modoTurbo() {
        if (!ligado) {
            System.out.println("Nao e possivel ativar o modo turbo com o aparelho desligado.");
            return;
        }
        processarResfriamentoRapido();
    }

    private void processarResfriamentoRapido() {
        System.out.println("Aumentando rotacao do compressor...");
        System.out.println("Ligando ventilacao maxima...");
        setTemperatura(16);
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura + "C" +
                ", status=" + (ligado ? "ligado" : "desligado") +
                '}';
    }
}
