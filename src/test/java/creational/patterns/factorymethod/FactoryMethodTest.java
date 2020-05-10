package creational.patterns.factorymethod;


import creational.patterns.factorymethod.factory.CountryFactory;
import creational.patterns.factorymethod.factory.ItalyFactory;
import creational.patterns.factorymethod.factory.UnitedKingdomFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import creational.patterns.factorymethod.domain.Country;
import creational.patterns.factorymethod.domain.Italy;
import creational.patterns.factorymethod.domain.UnitedKingdom;

class FactoryMethodTest {

    @Test
    void shouldCreateUK() {
        // given
        CountryFactory ukFactory = new UnitedKingdomFactory();
        Country uk = ukFactory.getCountry();

        // when
        String headOfState = uk.getHeadOfState();
        String typicalBreakfast = uk.getTypicalBreakfast();
        String currency = uk.getCurrency();
        Long population = uk.getPopulation();

        // then
        Assertions.assertThat(headOfState).isEqualTo(UnitedKingdom.HEAD_OF_STATE);
        Assertions.assertThat(typicalBreakfast).isEqualTo(UnitedKingdom.BREAKFAST);
        Assertions.assertThat(currency).isEqualTo(UnitedKingdom.CURRENCY);
        Assertions.assertThat(population).isEqualTo(UnitedKingdom.POPULATION);
    }

    @Test
    void shouldCreateItaly() {
        // given
        CountryFactory italyFactory = new ItalyFactory();
        Country italy = italyFactory.getCountry();

        // when
        String headOfState = italy.getHeadOfState();
        String typicalBreakfast = italy.getTypicalBreakfast();
        String currency = italy.getCurrency();
        Long population = italy.getPopulation();

        // then
        Assertions.assertThat(headOfState).isEqualTo(Italy.HEAD_OF_STATE);
        Assertions.assertThat(typicalBreakfast).isEqualTo(Italy.BREAKFAST);
        Assertions.assertThat(currency).isEqualTo(Italy.CURRENCY);
        Assertions.assertThat(population).isEqualTo(Italy.POPULATION);
    }
}