package Driver;

import transport.Transport;

import java.util.Objects;

import static transport.Transport.validOrDefault;

public abstract class Driver<T extends Transport>{

    private String fioDriver;
    private String havingDriverLicense;
    private int experience;
    private T car;

    protected Driver(String fioDriver, String havingDriverLicense, int experience, T car){
        this.fioDriver = validOrDefault(fioDriver, "Default");
        this.havingDriverLicense = validOrDefault(havingDriverLicense,"Default");
        this.experience =experience>0?experience:0;
        setCar(car);
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        if ( car==null){
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.car = car;
    }

    public String getFioDriver() {
        return fioDriver;
    }

    public void setFioDriver(String fioDriver) {
        this.fioDriver = fioDriver;
    }

    public String getHavingDriverLicense() {
        return havingDriverLicense;
    }

    public int getExperience() {
        return experience;
    }




    public void Refill() {
        System.out.println(getFioDriver() + " заправить авто.");
    }


    public void startMoving() {
        System.out.println(getFioDriver() + " начать движение!!");
    }


    public void finishMoving() {
        System.out.println(getFioDriver() + " закончить движение!!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fioDriver, driver.fioDriver) && Objects.equals(havingDriverLicense, driver.havingDriverLicense) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fioDriver, havingDriverLicense, experience, car);
    }

    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет участвовать в гонках",
                getFioDriver(), this.car.getBrand(), this.car.getModel());


    }


}
