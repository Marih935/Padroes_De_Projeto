public class RioEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Criminal();
    }
}
