public class TestaBasquete {
    public static void main(String[] args) {
        Atleta armador = new Atleta(1, "Lucas Alves", "Armador");
        Atleta ala = new Atleta(2, "Pedro Lima", "Ala");

        Time franca = new Time(1, "Franca Basquete", "Helinho Garcia");
        franca.contratarAtleta(armador);
        franca.contratarAtleta(ala);

        System.out.println("Time criado e atletas contratados:");
        System.out.println(franca);

        // demonstra agregação: mesmo anulando a referência do time, o atleta continua existindo
        franca = null;
        System.out.println("Atleta permanece acessível após o Time ser anulado: " + armador);
    }
}
