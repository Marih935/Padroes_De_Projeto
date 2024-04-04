public class GameSimulation {
    public static void main(String[] args) {
        Location amazonLocation = new AmazonLocation();
        Enemy amazonEnemy = amazonLocation.createEnemy();
        amazonEnemy.attack();

        Location sertaoLocation = new SertaoLocation();
        Enemy sertaoEnemy = sertaoLocation.createEnemy();
        sertaoEnemy.attack();

        Location rioDeJaneiroLocation = new RioDeJaneiroLocation();
        Enemy rioDeJaneiroEnemy = rioDeJaneiroLocation.createEnemy();
        rioDeJaneiroEnemy.attack();
    }
}
