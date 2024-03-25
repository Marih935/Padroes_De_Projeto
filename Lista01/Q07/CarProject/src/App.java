public class App {
    public static void main(String[] args) {
        Body carBoby = new Body();
        carBoby.addPart(new Engine());
        carBoby.addPart(new Suspension());
        carBoby.addPart(new Wheels());

        Chassi carChassis = new Chassi();
        carChassis.addPart(new Suspension());
        carChassis.addPart(new Powertrain());

        double totalWeight = carChassis.getWeight() + carBoby.getWeight();
        System.out.println("Peso total do carro: " + totalWeight);
    }
}
