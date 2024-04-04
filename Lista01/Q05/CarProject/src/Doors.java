public class Doors implements CarPart {
    // Leaf
    double weight;
    String name = "Portas";

    public Doors(double weight) {
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
