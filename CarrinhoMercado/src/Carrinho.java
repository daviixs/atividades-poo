import java.util.ArrayList;
import java.util.Iterator;

public class Carrinho {
    private final String nomeLoja;
    private final ArrayList<Produto> produtos;
    private final ArrayList<ItemVenda> itensVenda;

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.produtos = new ArrayList<>();
        this.itensVenda = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        if (p != null) {
            produtos.add(p);
        }
    }

    public void exibirCarrinho() {
        System.out.println("Loja: " + nomeLoja);
        System.out.println("Produtos agregados:");

        if (produtos.isEmpty()) {
            System.out.println("- Nenhum produto no carrinho");
            return;
        }

        for (Produto produto : produtos) {
            System.out.println("- " + produto);
        }
    }

    public void gerarItem(int id, int qtd, float valor) {
        ItemVenda item = new ItemVenda(id, qtd, valor);
        itensVenda.add(item);
    }

    public boolean removerItemPorId(int id) {
        Iterator<ItemVenda> iterator = itensVenda.iterator();

        while (iterator.hasNext()) {
            ItemVenda item = iterator.next();
            if (item.getId() == id) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
            "nomeLoja='" + nomeLoja + '\'' +
            ", produtos=" + produtos +
            ", itensVenda=" + itensVenda +
            '}';
    }
}
