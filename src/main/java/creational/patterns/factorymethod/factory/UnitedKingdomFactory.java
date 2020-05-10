package creational.patterns.factorymethod.factory;

import creational.patterns.factorymethod.domain.Country;
import creational.patterns.factorymethod.domain.UnitedKingdom;

public class UnitedKingdomFactory implements CountryFactory {
    @Override
    public Country getCountry() {
        return new UnitedKingdom();
    }
}
