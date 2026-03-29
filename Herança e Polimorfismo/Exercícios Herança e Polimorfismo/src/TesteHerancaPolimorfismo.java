public class TesteHerancaPolimorfismo {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing", "737", 850.0f, 12000.0f);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 120.0f, 450);

        Veiculo veiculo;

        veiculo = aviao;
        veiculo.mover();
        veiculo.abastecer();

        veiculo = carroEletrico;
        veiculo.mover();
        veiculo.abastecer();
    }
}
