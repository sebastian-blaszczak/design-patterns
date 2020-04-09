package observer

import behavioral.patterns.observer.observer.Capitalize
import behavioral.patterns.observer.observer.LowerCase
import behavioral.patterns.observer.observer.UpperCase
import behavioral.patterns.observer.subject.StringProvider
import spock.lang.Specification

class ObserverTest extends Specification {

    def "should format string value after setting it to subject"() {
        given:
        StringProvider stringProvider = new StringProvider()
        Capitalize capitalize = new Capitalize(stringProvider)
        LowerCase lowerCase = new LowerCase(stringProvider)
        UpperCase upperCase = new UpperCase(stringProvider)

        when:
        stringProvider.setValue("testValue")

        then:
        capitalize.getCapitalizeValue() == "TestValue"
        lowerCase.getLowerCaseValue() == "testvalue"
        upperCase.getUpperCaseValue() == "TESTVALUE"
    }
}
