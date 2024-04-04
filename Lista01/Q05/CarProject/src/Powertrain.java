import java.util.ArrayList;
import java.util.List;

public class Powertrain implements CarPart {
    // Composite
    private List<CarPart> parts = new ArrayList<>();
    
    public void addPart(CarPart part) {
        parts.add(part);
    }

    public List<CarPart> getParts() {
        return parts;
    }

    @Override
    public double getWeight() {
        double totalWeight = 0;
        for (CarPart part : parts) {
            totalWeight += part.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String getName() {
        return "Trem de força";
    }
}
