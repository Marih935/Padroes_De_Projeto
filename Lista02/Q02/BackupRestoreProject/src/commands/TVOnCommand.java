package commands;

import devices.TV;

import java.io.*;

public class TVOnCommand implements Command {
    private TV tv;
    private static final String FILENAME = "tv_command.txt";

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

    @Override
    public void store() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            writer.println("TVOnCommand");
            writer.println(tv.getChannel());
            writer.println(tv.getVolume());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line = reader.readLine();
            if ("TVOnCommand".equals(line)) {
                int channel = Integer.parseInt(reader.readLine());
                int volume = Integer.parseInt(reader.readLine());
                tv.setInputChannel(channel);
                tv.setVolume(volume);
                this.execute();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
