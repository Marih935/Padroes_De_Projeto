public class Snooper {
    public Snooper(WebSearchModel model) {
        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        }, new FriendQueryFilter());

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("So long.... " + query);
            }
        }, new LengthQueryFilter());
    }
}
