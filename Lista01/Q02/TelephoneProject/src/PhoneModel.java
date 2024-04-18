import java.util.ArrayList;
import java.util.List;

class PhoneModel {
    private List<PhoneObserver> observers = new ArrayList<>();
    private List<Integer> digits = new ArrayList<>();

    public void registerObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(int newDigit) {
        for (PhoneObserver observer : observers) {
            observer.update(newDigit);
        }
    }

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }
}