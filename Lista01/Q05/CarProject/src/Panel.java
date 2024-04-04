public class Panel implements CarPart {
    // Leaf
    double weight;
    String name = "Painel";

    public Panel(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }
}
