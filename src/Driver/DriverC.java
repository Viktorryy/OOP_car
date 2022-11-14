package Driver;

import transport.Truck;

public class DriverC extends Driver<Truck>{


    public DriverC(String fioDriver,  int experience, Truck car) {
        super(fioDriver, "C", experience, car);
    }

    public DriverC(String fioDriver, String havingDriverLicense, int experience, Truck car) {
        super(fioDriver, havingDriverLicense, experience, car);
    }
}
