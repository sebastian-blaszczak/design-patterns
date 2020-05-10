package creational.patterns.abstractfactory;

import creational.patterns.abstractfactory.domain.ATV;
import creational.patterns.abstractfactory.domain.Vehicle;

public class ATVFactory extends AbstractVehicleFactory {
    @Override
    Vehicle makeVehicle() {
        return new ATV();
    }
}
