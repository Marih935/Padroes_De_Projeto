import java.io.File;

public class Main {
    public static void main(String[] args) {
        File inputTextFile = new File("src/Hamlet.txt");

        WebSearchModel model = new WebSearchModel(inputTextFile);
        new Snooper(model);

        model.pretendToSearch();
    }
}
