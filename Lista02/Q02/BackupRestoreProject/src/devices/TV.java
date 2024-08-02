package devices;
import java.io.Serializable;

public class TV implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean on = false;
    private int channel = 0;
    private int volume = 0;

    public void on() {
        on = true;
        System.out.println("TV is ON");
    }

    public void off() {
        on = false;
        System.out.println("TV is OFF");
    }

    public void setInputChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel set to " + channel);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to " + volume);
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

}
