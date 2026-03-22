public class TestaVendaSupermercado {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Joana Prado");
        Produto arroz = new Produto(1, "Arroz 5kg", 25.0);
        Produto feijao = new Produto(2, "Feijão 1kg", 8.5);
        Produto leite = new Produto(3, "Leite 1L", 4.2);

        Venda venda = new Venda(1, cliente);
        venda.adicionarItem(1, arroz, 2);
        venda.adicionarItem(2, feijao, 3);
        venda.adicionarItem(3, leite, 6);

        System.out.println(venda);
    }
}
