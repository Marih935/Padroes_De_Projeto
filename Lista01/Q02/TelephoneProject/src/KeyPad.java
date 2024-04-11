import java.util.Random;

public class KeyPad {
    private final PhoneModel phone;

    public KeyPad(PhoneModel phone) {
        this.phone = phone;
    }

    public void simulateKeyPresses(int numKeyPresses) {
        final int MAX_DIGIT = 12;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            phone.addDigit(newDigit);
        }
    }

}
