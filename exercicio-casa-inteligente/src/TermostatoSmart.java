public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private final double temperaturaAtual;
    private boolean ligado;

    public TermostatoSmart(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Termostato ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Termostato desligado.");
    }

    @Override
    public double lerTemperatura() {
        return temperaturaAtual;
    }
}
