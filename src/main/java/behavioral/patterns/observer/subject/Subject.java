package behavioral.patterns.observer.subject;

import behavioral.patterns.observer.observer.Observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setValue(Object object);

    Object getValue();

}
