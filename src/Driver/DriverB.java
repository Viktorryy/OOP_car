package Driver;

import transport.Car;

public class DriverB extends Driver<Car>{


    public DriverB(String fioDriver,  int experience, Car car) {
        super(fioDriver, "B", experience, car);
    }

    @Override
    public String toString() {
        return "Driver.DriverB{} " + super.toString();
    }

}
