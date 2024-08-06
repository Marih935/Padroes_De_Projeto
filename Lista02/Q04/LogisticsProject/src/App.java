public class App {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Notebook");
        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.processarPedido(produto);
    }
}
