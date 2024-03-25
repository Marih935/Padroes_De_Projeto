public class Powertrain implements CarPart {
    // Leaf
    @Override
    public double getWeight() {
        double weight = 200;
        return weight;
    }

    @Override
    public String getName() {
        return "Trem de força";
    }
}
