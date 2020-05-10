package creational.patterns.abstractfactory;

import creational.patterns.abstractfactory.domain.ATV;
import creational.patterns.abstractfactory.domain.Car;
import creational.patterns.abstractfactory.domain.Motorcycle;
import creational.patterns.abstractfactory.domain.Vehicle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    void shouldMakeATV() throws UnsupportedFactory {
        // given
        AbstractVehicleFactory vehicleFactory = AbstractVehicleFactory.getFactory(FactoryType.ATV);

        // when
        Vehicle atv = vehicleFactory.makeVehicle();

        // then
        Assertions.assertThat(atv.getName()).isEqualTo(ATV.NAME);
        Assertions.assertThat(atv.getNumberOfWheels()).isEqualTo(ATV.NUMBER_OF_WHEELS);
        Assertions.assertThat(atv.getNumberOfPassengers()).isEqualTo(ATV.NUMBER_OF_PASSENGERS);
    }

    @Test
    void shouldMakeCar() throws UnsupportedFactory {
        // given
        AbstractVehicleFactory vehicleFactory = AbstractVehicleFactory.getFactory(FactoryType.CAR);

        // when
        Vehicle car = vehicleFactory.makeVehicle();

        // then
        Assertions.assertThat(car.getName()).isEqualTo(Car.NAME);
        Assertions.assertThat(car.getNumberOfWheels()).isEqualTo(Car.NUMBER_OF_WHEELS);
        Assertions.assertThat(car.getNumberOfPassengers()).isEqualTo(Car.NUMBER_OF_PASSENGERS);
    }

    @Test
    void shouldMakeMotorcycle() throws UnsupportedFactory {
        // given
        AbstractVehicleFactory vehicleFactory = AbstractVehicleFactory.getFactory(FactoryType.MOTORCYCLE);

        // when
        Vehicle motorcycle = vehicleFactory.makeVehicle();

        // then
        Assertions.assertThat(motorcycle.getName()).isEqualTo(Motorcycle.NAME);
        Assertions.assertThat(motorcycle.getNumberOfWheels()).isEqualTo(Motorcycle.NUMBER_OF_WHEELS);
        Assertions.assertThat(motorcycle.getNumberOfPassengers()).isEqualTo(Motorcycle.NUMBER_OF_PASSENGERS);
    }

}