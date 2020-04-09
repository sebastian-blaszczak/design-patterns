package behavioral.patterns.observer.observer;

import behavioral.patterns.observer.subject.Subject;

public class LowerCase implements Observer {

    Subject subject;
    String lowerCaseValue;

    public LowerCase(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        String value = (String) subject.getValue();
        lowerCaseValue = value.toLowerCase();
    }

    public String getLowerCaseValue() {
        return lowerCaseValue;
    }
}
