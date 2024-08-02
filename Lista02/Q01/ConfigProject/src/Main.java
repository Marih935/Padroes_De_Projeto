public class Main {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        config.printAllConfig();

        String appId = config.get("AppId");
        System.out.println("AppId: " + appId);
    }
}
