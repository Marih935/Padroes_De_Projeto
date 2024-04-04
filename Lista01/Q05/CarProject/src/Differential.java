public class Differential implements CarPart {
    // Leaf
    double weight;
    String name = "Diferencial";

    public Differential(double weight) {
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
