package creational.patterns.factorymethod.domain;

public class Italy  implements Country {
    @Override
    public String getHeadOfState() {
        return HEAD_OF_STATE;
    }

    @Override
    public String getTypicalBreakfast() {
        return BREAKFAST;
    }

    @Override
    public String getCurrency() {
        return CURRENCY;
    }

    @Override
    public Long getPopulation() {
        return POPULATION;
    }

    public static final String HEAD_OF_STATE = "President";
    public static final String BREAKFAST = "Bruschetta with latte";
    public static final String CURRENCY = "€";
    public static final long POPULATION = 66500000L;
}
