public class AmazonEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new MutantAnimal();
    }
}
