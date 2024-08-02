import commands.LightOnCommand;
import commands.TVOnCommand;
import devices.Light;
import devices.TV;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        
        RemoteControl remoteControl = new RemoteControl();

        System.out.println("Simulating normal operation...");
        remoteControl.pressButton(lightOnCommand);

        tv.setInputChannel(3);
        tv.setVolume(10);
        remoteControl.pressButton(tvOnCommand);

        System.out.println("Simulating failure...");
        light.off();
        tv.off();

        System.out.println("Recovering...");
        remoteControl.recover();
    }
}
