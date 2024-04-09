public class Main {
    public static void main(String[] args) {
        // Criar o pedido
        Order order = new Order();

        // Adicionar bolos ao pedido
        order.addCake(new ChocolateCake());

        Cake vanillaCakeWithSaying = new SayingDecorator(new VanillaCake(), "PLAIN!");
        order.addCake(vanillaCakeWithSaying);

        Cake vanillaCakeWithSprinklesAndSaying = new SayingDecorator(new SprinklesDecorator(new VanillaCake()),"FANCY");
        order.addCake(vanillaCakeWithSprinklesAndSaying);

        Cake multiLayeredStrawberryCake = new MultiLayeredCakeDecorator(new SayingDecorator(new SayingDecorator(new SprinklesDecorator(new SprinklesDecorator(new StrawberryCake())),"One of"),"EVERYTHING"));
        order.addCake(multiLayeredStrawberryCake);

        // Imprimir o pedido
        order.printOrder();
    }
}
