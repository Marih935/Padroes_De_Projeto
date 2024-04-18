public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        PhoneModel phone = new PhoneModel();
        Screen screen = new Screen(phone);
        KeyPad keyPad = new KeyPad(phone);

        keyPad.simulateKeyPresses(NUM_DIGITS);
        screen.dialingNotification();
    }
}
