public class AmazonLocation implements Location {
    @Override
    public Enemy createEnemy() {
        return new MutantAnimalEnemy();
    }
}
