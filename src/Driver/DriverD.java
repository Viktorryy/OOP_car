package Driver;

import transport.Bus;

public class DriverD extends Driver<Bus>{

    public DriverD(String fioDriver,  int experience, Bus car) {
        super(fioDriver, "D", experience, car);
    }

    @Override
    public String toString() {
        return "Driver.DriverD{} " + super.toString();
    }
}
