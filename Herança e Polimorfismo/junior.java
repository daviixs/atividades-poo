public class Junior extends Desenvolvedor {
    public Junior(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println("Junior codando com apoio da equipe");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
}
