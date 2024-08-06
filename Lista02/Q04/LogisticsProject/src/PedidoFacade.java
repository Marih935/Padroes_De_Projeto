public class PedidoFacade {

    private ServicoEstoque estoque;
    private ServicoPagamento pagamento;
    private ServicoRemessa remessa;

    public PedidoFacade() {
        this.estoque = new ServicoEstoque();
        this.pagamento = new ServicoPagamento();
        this.remessa = new ServicoRemessa();
    }

    public void processarPedido(Produto produto) {
        if (ServicoEstoque.isAvailable(produto)) {
            if (ServicoPagamento.makePayment()) {
                ServicoRemessa.shipProduct(produto);
                System.out.println("Pedido processado com sucesso!");
            } else {
                System.out.println("Falha no pagamento.");
            }
        } else {
            System.out.println("Produto não disponível no estoque.");
        }
    }
}
