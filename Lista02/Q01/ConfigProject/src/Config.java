import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Config {
    private static Config instance;
    private Map<String, String> configData = new HashMap<>();

    private Config() {
        loadConfig();
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void loadConfig() {
        File configFile = new File("src/Config.txt");
        if (!configFile.exists()) {
            System.err.println("Erro: O arquivo de configuração não existe");
            return;
        }

        try (Scanner scanner = new Scanner(configFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    configData.put(parts[0].trim(), parts[1].trim());
                }
            }
            System.out.println("Arquivo de configuração carregado com sucesso.");
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao ler o arquivo de configuração: " + e.getMessage());
        }
    }

    public String get(String key) {
        return configData.get(key);
    }

    public void printAllConfig() {
        configData.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}