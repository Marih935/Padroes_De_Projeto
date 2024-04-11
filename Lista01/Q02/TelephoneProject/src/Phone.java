public interface Phone {
    void registerObserver(PhoneObserver observer);
    void removeObserver(PhoneObserver observer);
    void notifyObservers(int newDigit);
}
