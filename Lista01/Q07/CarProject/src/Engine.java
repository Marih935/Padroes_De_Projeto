public class Engine implements CarPart {
    // Leaf
    @Override
    public double getWeight() {
        double weight = 100;
        return weight;
    }

    @Override
    public String getName() {
        return "Engine";
    }
}
