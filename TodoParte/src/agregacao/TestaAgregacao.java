package agregacao;

public class TestaAgregacao {
    public static void main(String[] args) {
        Empresa google = new Empresa(1, "Google", "123456");
        FreeLancer fl1 = new FreeLancer("Maria", 13, "Gerente");

        google.adcionarFreelancer(fl1);
        System.out.println("Depois de criar/adicionar freelancer: " + google);

        google.removerFreelancer(fl1);
        System.out.println("Depois de deletar/remover freelancer: " + google);
    }
}
