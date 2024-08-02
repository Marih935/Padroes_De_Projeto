package devices;
import java.io.Serializable;

public class Light implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean on = false;

    public void on() {
        on = true;
        System.out.println("Light is ON");
    }

    public void off() {
        on = false;
        System.out.println("Light is OFF");
    }

    public boolean isOn() {
        return on;
    }
}
