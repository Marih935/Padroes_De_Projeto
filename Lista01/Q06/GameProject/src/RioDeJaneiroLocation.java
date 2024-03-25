public class RioDeJaneiroLocation implements Location {
    @Override
    public Enemy createEnemy() {
        return new CriminalEnemy();
    }
}
