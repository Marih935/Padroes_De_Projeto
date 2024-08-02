package commands;

import devices.Light;

import java.io.*;

public class LightOnCommand implements Command {
    private Light light;
    private static final String FILENAME = "light_command.txt";

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

    @Override
    public void store() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            writer.println("LightOnCommand");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line = reader.readLine();
            if ("LightOnCommand".equals(line)) {
                this.execute();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
