package behavioral.patterns.observer.subject;

import behavioral.patterns.observer.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class StringProvider implements Subject {

    Set<Observer> observers;
    String value;

    public StringProvider() {
        observers = new HashSet<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setValue(Object object) {
        value = (String) object;
        notifyObservers();
    }

    @Override
    public Object getValue() {
        return value;
    }
}
