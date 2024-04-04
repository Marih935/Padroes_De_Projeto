import java.util.ArrayList;
import java.util.List;

public class Body implements CarPart {
    // Composite
    private List<CarPart> parts = new ArrayList<>();

    public void addPart(CarPart part) {
        parts.add(part);
    }

    @Override
    public double getWeight() {
        double totalWeight = 0;
        for (CarPart part : parts) {
            totalWeight += part.getWeight();
            System.out.println("Somando agora o peso de: " + part.getName() + " " + part.getWeight() + " Total parcial: " + totalWeight);
        }
        System.out.println("Peso total da carroceria: " + totalWeight);
        return totalWeight;
    }

    @Override
    public String getName() {
        return "Carroceria";
    }
}
