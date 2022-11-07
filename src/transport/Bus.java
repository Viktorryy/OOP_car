package transport;

import java.util.Objects;

public class Bus extends Transport implements Competing {

    public enum BusCapacity{
        B1("особо малая (до 10 мест)"),
        B2("малая (до 25)"),
        B3("средняя (40–50)"),
        B4("большая (60–80) "),
        B5("особо большая (100–120 мест)" );

        private final String capacity;
        BusCapacity(String capacity) {
            this.capacity = capacity;
        }
    }

    public BusCapacity busCapacity;

    public Bus(String brand, String model, float volumeEngine, BusCapacity busCapacity) {
        super(brand, model, volumeEngine);
        this.busCapacity = busCapacity;
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println(super.getBrand() + " начать движение!!");
    }

    @Override
    public void finishMoving() {
        System.out.println(super.getBrand() + " закончить движение!!");
    }

    @Override
    public void definitionType() {
        if (busCapacity == null) {
            System.out.println("Данных по авто недостаточно!!");
        } else {
            System.out.println("Тип авто:" + busCapacity.capacity);
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус "+ getBrand()+" "+ getModel()+" диагностика не требуется");
        return true;
    }

    public void Refill() {
        System.out.println("Нужно заправлять бензином или дизелем на заправке.");
    }

    @Override
    public String toString() {
        return "transport.Bus{} " + super.toString()+", вместимость: "+ busCapacity.capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return busCapacity == bus.busCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), busCapacity);
    }

    @Override
    public void pitStop() {
        System.out.println(super.getBrand() + " " + super.getModel() + " " + PIT);
    }

    @Override
    public void bestLapTime() {
        System.out.println(BEST + " " + super.getBrand() + " " + super.getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println(SPEED + " " + super.getBrand() + " " + super.getModel());
    }
}
