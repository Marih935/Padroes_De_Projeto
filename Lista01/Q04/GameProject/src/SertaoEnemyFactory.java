public class SertaoEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Cangaceiro();
    }
}
