package creational.patterns.factorymethod.domain;

public class UnitedKingdom implements Country {
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

    public static final String HEAD_OF_STATE = "Queen";
    public static final String BREAKFAST = "Beans with poached eggs and tea";
    public static final String CURRENCY = "£";
    public static final long POPULATION = 60300000L;
}
