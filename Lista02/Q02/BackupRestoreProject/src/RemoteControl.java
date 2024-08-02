import commands.Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandHistory = new ArrayList<>();

    public void pressButton(Command command) {
        command.execute();
        commandHistory.add(command);
        command.store();
    }

    public void recover() {
        for (Command command : commandHistory) {
            command.load();
        }
    }
}
