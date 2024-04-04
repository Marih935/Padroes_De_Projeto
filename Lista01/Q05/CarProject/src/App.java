public class App {
    public static void main(String[] args) {
        
        Powertrain carPowertrain = new Powertrain();
        carPowertrain.addPart(new Transmission(80));
        carPowertrain.addPart(new Engine(100));
        carPowertrain.addPart(new Differential(40));
        carPowertrain.addPart(new Wheels(20));

        Chassi carChassis = new Chassi();
        carChassis.addPart(carPowertrain);
        carChassis.addPart(new Suspension(50));
        
        Body carBoby = new Body();
        carBoby.addPart(new Doors(30));
        carBoby.addPart(new Panel(10));

        double totalWeight = carChassis.getWeight() + carBoby.getWeight();
        System.out.println("Peso total do carro: " + totalWeight);
    }
}
