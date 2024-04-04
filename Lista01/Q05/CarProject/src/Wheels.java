public class Wheels implements CarPart {
    // Leaf
    double weight;
    String name = "Rodas";

    public Wheels(double weight) {
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
