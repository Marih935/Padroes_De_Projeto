import java.util.ArrayList;
import java.util.List;

public class Chassi implements CarPart {
    // Composite
    private List<CarPart> parts = new ArrayList<>();

    public void addPart(CarPart part) {
        parts.add(part);
    }

    @Override
    public double getWeight() {
        double totalWeight = 0;
        double totalPowertrainWeight = 0;

        // Partes do Powertrain
        for (CarPart part : parts) {
            if (part instanceof Powertrain) {
                Powertrain powertrain = (Powertrain) part;
                System.out.println("Calculando o peso do trem de força");
                for (CarPart powertrainPart : powertrain.getParts()) {
                    totalPowertrainWeight += powertrainPart.getWeight();
                    System.out.println("Somando agora o peso de " + powertrainPart.getName() + ": " + powertrainPart.getWeight() + " Total parcial: " + totalPowertrainWeight);
                }
            }
        }

        // Partes do Chassi
        for (CarPart part : parts) {
            totalWeight += part.getWeight();
            System.out.println("Somando agora o peso de: " + part.getName() + " " + part.getWeight() + " Total parcial: " + totalWeight);
        }

        System.out.println("Peso total do chassi: " + totalWeight);
        return totalWeight;
    }

    @Override
    public String getName() {
        return "Chassi";
    }
}
