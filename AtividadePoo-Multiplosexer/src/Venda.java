import java.util.ArrayList;
import java.util.List;

public class Venda {
    private final int id;
    private final Cliente cliente;
    private final List<ItemVenda> itens;

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(int idItem, Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            itens.add(new ItemVenda(idItem, quantidade, produto));
        }
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Venda ").append(id).append(" para ").append(cliente.getNome()).append("\n");
        for (ItemVenda item : itens) {
            builder.append(" - ").append(item).append("\n");
        }
        builder.append("Total: ").append(calcularTotal());
        return builder.toString();
    }
}
