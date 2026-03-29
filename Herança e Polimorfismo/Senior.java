public class Senior extends Desenvolvedor {
    public Senior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println("Senior codando, revisando arquitetura e mentorando");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }
}
