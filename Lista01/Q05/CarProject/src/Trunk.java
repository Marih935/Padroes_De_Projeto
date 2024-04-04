public class Trunk implements CarPart {
    // Leaf
    @Override
    public double getWeight() {
        double weight = 50;
        return weight;
    }

    @Override
    public String getName() {
        return "Porta-malas";
    }
}
