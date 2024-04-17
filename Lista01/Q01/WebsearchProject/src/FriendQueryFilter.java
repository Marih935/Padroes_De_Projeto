public class FriendQueryFilter implements QueryObeserver{
    @Override
    public boolean isInterested(String query) {
        return query.toLowerCase().contains("friend");
    }
}
