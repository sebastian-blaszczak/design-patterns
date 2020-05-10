package creational.patterns.abstractfactory;

import creational.patterns.abstractfactory.domain.Vehicle;

abstract class AbstractVehicleFactory {

    static AbstractVehicleFactory getFactory(FactoryType type) throws UnsupportedFactory {
        switch (type) {
            case ATV:
                return new ATVFactory();
            case CAR:
                return new CarFactory();
            case MOTORCYCLE:
                return new MotorcycleFactory();
            default:
                throw new UnsupportedFactory();
        }
    }

    abstract Vehicle makeVehicle();
}
