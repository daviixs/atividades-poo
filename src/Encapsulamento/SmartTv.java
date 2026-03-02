package Encapsulamento;

public class SmartTv {
    private String marca, modelo;
    private int volume;

    //construtor sem parametros
    public SmartTv() {
        this.volume = 0;
    }

    //construtor com parametros
    public SmartTv(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = 0;
    }

    //setters de volume
    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume Invalido");
    }

    //getters de volume
    public int getVolume() {
        return this.volume;
    }

    public String toString() {
        return "SmartTv{" + "marca=" + marca + ", modelo=" + modelo + ", volume=" + volume + '}';
    }
}
