public class Engine implements CarPart {
    // Leaf
    double weight;
    String name = "Motor";

    public Engine(double weight) {
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
