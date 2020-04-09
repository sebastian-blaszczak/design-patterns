package behavioral.patterns.observer.observer;

import behavioral.patterns.observer.subject.Subject;

public class UpperCase implements Observer {

    Subject subject;
    String upperCaseValue;

    public UpperCase(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        String value = (String) subject.getValue();
        upperCaseValue = value.toUpperCase();
    }

    public String getUpperCaseValue() {
        return upperCaseValue;
    }
}
