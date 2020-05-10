package creational.patterns.abstractfactory.domain;

public class Motorcycle implements Vehicle {

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public short getNumberOfWheels() {
        return NUMBER_OF_WHEELS;
    }

    @Override
    public short getNumberOfPassengers() {
        return NUMBER_OF_PASSENGERS;
    }

    public static final String NAME = "Motorcycle";
    public static final short NUMBER_OF_WHEELS = 2;
    public static final short NUMBER_OF_PASSENGERS = 2;

}
