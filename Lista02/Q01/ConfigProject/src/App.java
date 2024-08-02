public class App {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        config.printAllConfig();

        String search = config.get("DLCName");
        System.out.println("Searching in Config.txt...");
        System.out.println("DLCName: " + search);
    }
}
