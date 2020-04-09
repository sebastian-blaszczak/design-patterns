package behavioral.patterns.observer.observer;

import behavioral.patterns.observer.subject.Subject;
import org.apache.commons.lang3.StringUtils;

public class Capitalize implements Observer {
    Subject subject;
    String capitalizeValue;

    public Capitalize(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        String value = (String) subject.getValue();
        capitalizeValue = StringUtils.capitalize(value);
    }

    public String getCapitalizeValue() {
        return capitalizeValue;
    }
}
