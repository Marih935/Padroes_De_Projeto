public class SertaoLocation implements Location {
    @Override
    public Enemy createEnemy() {
        return new CangaceiroEnemy();
    }
}
