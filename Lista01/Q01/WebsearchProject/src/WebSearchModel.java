import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();

    public interface QueryObserver {
        void onQuery(String query);
    }

    public void addQueryObserver(QueryObserver queryObserver, QueryObeserver filter) {
        observers.add(new QueryObserver() {
            @Override
            public void onQuery(String query) {
                if (filter.isInterested(query)) {
                    queryObserver.onQuery(query);
                }
            }
        });
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                notifyInterestedObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void notifyInterestedObservers(String line) {
        for (QueryObserver obs : observers) {
            obs.onQuery(line);
        }
    }
}
