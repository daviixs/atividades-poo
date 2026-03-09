public class TestaAr {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("LG", "Dual Inverter", 22);

        ar.setTemperatura(10);
        ar.setTemperatura(25);

        System.out.println(ar);

        ar.modoTurbo();

        ar.ligar();
        ar.modoTurbo();

        System.out.println(ar);
    }
}
