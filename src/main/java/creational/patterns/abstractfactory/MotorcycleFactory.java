package creational.patterns.abstractfactory;

import creational.patterns.abstractfactory.domain.Motorcycle;
import creational.patterns.abstractfactory.domain.Vehicle;

public class MotorcycleFactory extends AbstractVehicleFactory {
    @Override
    Vehicle makeVehicle() {
        return new Motorcycle();
    }
}
