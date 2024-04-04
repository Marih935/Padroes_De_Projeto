public class Transmission implements CarPart {
    // Leaf
    double weight;
    String name = "Transmissão";

    public Transmission(double weight) {
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
