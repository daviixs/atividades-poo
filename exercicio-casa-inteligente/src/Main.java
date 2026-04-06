public class Main {
    public static void main(String[] args) {
        FechaduraEletronica fechadura = new FechaduraEletronica("1234");
        fechadura.validarAcesso("1234");
        fechadura.ligar();
        fechadura.desligar();

        TermostatoSmart termostato = new TermostatoSmart(23.5);
        termostato.ligar();
        System.out.println("Temperatura atual: " + termostato.lerTemperatura() + " C");
        termostato.desligar();
    }
}
