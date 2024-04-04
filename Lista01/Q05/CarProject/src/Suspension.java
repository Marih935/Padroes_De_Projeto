public class Suspension implements CarPart {
    // Leaf
    double weight;
    String name = "Suspensão";

    public Suspension(double weight) {
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
