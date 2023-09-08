package Model;

public class ModelItensPedido {
    private int id;
    private ModelPedido pedidoId;
    private ModelProduto produtoId;
    private int quantidade;
    private int statusItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelPedido getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(ModelPedido pedidoId) {
        this.pedidoId = pedidoId;
    }

    public ModelProduto getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(ModelProduto produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(int statusItem) {
        this.statusItem = statusItem;
    }
}
