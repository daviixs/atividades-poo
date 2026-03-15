public class TestaLoja {
    public static void main(String[] args) {
        Produto mouse = new Produto(1, "Mouse", 79.90f);
        Produto teclado = new Produto(2, "Teclado", 149.90f);
        Produto monitor = new Produto(3, "Monitor", 899.90f);

        Carrinho carrinho = new Carrinho("Atacadao");

        carrinho.adicionarProduto(mouse);
        carrinho.adicionarProduto(teclado);
        carrinho.adicionarProduto(monitor);

        carrinho.gerarItem(101, 2, 79.90f);
        carrinho.gerarItem(102, 1, 899.90f);

        carrinho.exibirCarrinho();
        System.out.println(carrinho.toString());
    }
}
