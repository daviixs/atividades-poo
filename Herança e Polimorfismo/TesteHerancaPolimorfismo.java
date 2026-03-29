public class TestaVetorPolimorfico {
    public static void main(String[] args) {
        Desenvolvedor[] desenvolvedores = new Desenvolvedor[4];

        desenvolvedores[0] = new Junior("Ana", 3500.0);
        desenvolvedores[1] = new Pleno("Bruno", 6000.0);
        desenvolvedores[2] = new Senior("Carla", 9000.0);
        desenvolvedores[3] = new Desenvolvedor("Daniel", 5000.0);

        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            desenvolvedor.codar();
            System.out.println("Bônus: R$ " + desenvolvedor.calcularBonus());
            System.out.println(desenvolvedor);
            System.out.println("---------------------------------");
        }
    }
              }
