public class MultiLayeredCakeDecorator extends Cake {
    private final Cake cake;

    public MultiLayeredCakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }
}
