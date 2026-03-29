public class Pleno extends Desenvolvedor {
    public Pleno(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void codar() {
        System.out.println("Pleno codando com autonomia e boas práticas");
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.15;
    }
}
