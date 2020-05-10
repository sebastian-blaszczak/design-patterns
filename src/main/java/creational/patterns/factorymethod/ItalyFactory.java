package creational.patterns.factorymethod;

import creational.patterns.factorymethod.domain.Country;
import creational.patterns.factorymethod.domain.Italy;

public class ItalyFactory implements CountryFactory {
    @Override
    public Country getCountry() {
        return new Italy();
    }
}
