public class Suspension implements CarPart {
    // Leaf
    @Override
    public double getWeight() {
        double weight = 50;
        return weight;
    }

    @Override
    public String getName() {
        return "Suspensão";
    }
}
