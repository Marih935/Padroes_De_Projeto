public class LengthQueryFilter implements QueryObeserver {
    @Override
    public boolean isInterested(String query) {
        return query.length() > 60;
    }
}
