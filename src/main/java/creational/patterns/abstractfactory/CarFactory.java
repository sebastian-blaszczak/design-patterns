package creational.patterns.abstractfactory;

import creational.patterns.abstractfactory.domain.Car;
import creational.patterns.abstractfactory.domain.Vehicle;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    Vehicle makeVehicle() {
        return new Car();
    }
}
