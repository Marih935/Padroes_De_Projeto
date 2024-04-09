public class SayingDecorator extends Cake {
    private final Cake cake;
    private final String saying;

    public SayingDecorator(Cake cake, String saying) {
        this.cake = cake;
        this.saying = saying;
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying \"" + saying + "\"";
    }
}
