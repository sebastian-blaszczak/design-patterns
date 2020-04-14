package observer

import behavioral.patterns.observer.observer.Capitalize
import behavioral.patterns.observer.observer.LowerCase
import behavioral.patterns.observer.observer.UpperCase
import behavioral.patterns.observer.subject.StringProvider
import spock.lang.Specification

class ObserverTest extends Specification {
    def setup() {
        stringProvider = new StringProvider()
        capitalize = new Capitalize(stringProvider)
        lowerCase = new LowerCase(stringProvider)
        upperCase = new UpperCase(stringProvider)
    }

    def "should format string value after setting up in subject"() {
        when:
        stringProvider.setValue("testValue")

        then:
        capitalize.getCapitalizeValue() == "TestValue"
        lowerCase.getLowerCaseValue() == "testvalue"
        upperCase.getUpperCaseValue() == "TESTVALUE"
    }

    def "should change string after setting new value to subject"() {
        when:
        stringProvider.setValue("testValue")
        stringProvider.setValue("anotherTestValue")

        then:
        capitalize.getCapitalizeValue() == "AnotherTestValue"
        lowerCase.getLowerCaseValue() == "anothertestvalue"
        upperCase.getUpperCaseValue() == "ANOTHERTESTVALUE"
    }

    def "should return empty string when not setting value"(){
        capitalize.getCapitalizeValue() == ""
        lowerCase.getLowerCaseValue() == ""
        upperCase.getUpperCaseValue() == ""
    }

    Capitalize capitalize
    LowerCase lowerCase
    UpperCase upperCase
    StringProvider stringProvider
}
