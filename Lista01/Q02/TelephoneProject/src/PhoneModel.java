import java.util.ArrayList;
import java.util.List;

class PhoneModel implements Phone {
    private List<PhoneObserver> observers = new ArrayList<>();
    private List<Integer> digits = new ArrayList<>();

    @Override
    public void registerObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(PhoneObserver observer) {
        observers.remove(observer);
    }

    @Override
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