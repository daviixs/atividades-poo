public class TestaEdificio {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Residencial Horizonte", "Rua das Flores, 123");
        edificio.construirApartamento(101, 1);
        edificio.construirApartamento(202, 2);
        edificio.construirApartamento(303, 3);

        System.out.println("Edifício e apartamentos construídos:");
        System.out.println(edificio);
    }
}
