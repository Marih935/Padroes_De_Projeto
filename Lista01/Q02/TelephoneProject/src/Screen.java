class Screen implements PhoneObserver {
    private final PhoneModel phone;

    public Screen(PhoneModel phone) {
        this.phone = phone;
        phone.registerObserver(this);
    }

    @Override
    public void update(int newDigit) {
        System.out.println(newDigit);
    }

    public void dialingNotification() {
        StringBuilder dialingMessage = new StringBuilder("Agora discando ");
        for (int digit : phone.getDigits()) {
            dialingMessage.append(digit);
        }
        System.out.println(dialingMessage.toString());
    }
}