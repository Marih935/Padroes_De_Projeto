public class GameSimulation {
    public static void main(String[] args) {
        EnemyFactory amazonFactory = new AmazonEnemyFactory();
        Enemy amazonEnemy = amazonFactory.createEnemy();
        amazonEnemy.attack();

        EnemyFactory sertaoFactory = new SertaoEnemyFactory();
        Enemy sertaoEnemy = sertaoFactory.createEnemy();
        sertaoEnemy.attack();
        
        EnemyFactory rioFactory = new RioEnemyFactory();
        Enemy rioEnemy = rioFactory.createEnemy();
        rioEnemy.attack();

    }
}
