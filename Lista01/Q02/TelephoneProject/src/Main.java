public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel phone = new PhoneModel();
        Screen screen = new Screen(phone);
        KeyPad keyPad = new KeyPad(phone);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
        screen.dialingNotification();
    }
}
