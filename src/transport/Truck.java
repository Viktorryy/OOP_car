package transport;

import java.util.Objects;

public class Truck extends Transport implements Competing{


    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");


        private final String body;
       LoadCapacity(String body) {
           this.body = body;
        }
    }
    public LoadCapacity loadCapacity;

    public Truck(String brand, String model, float volumeEngine, LoadCapacity loadCapacity) {
        super(brand, model, volumeEngine);
        this.loadCapacity=loadCapacity;
    }
    public Truck(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void Refill() {
        System.out.println("Заправить авто");
    }

    @Override
    public void startMoving() {
        System.out.println(super.getBrand()+" начать движение!!");
    }

    @Override
    public void finishMoving() {
        System.out.println(super.getBrand()+" закончить движение!!");
    }

    @Override
    public void definitionType() {
        if (loadCapacity == null) {
            System.out.println("Данных по авто недостаточно!!");
        } else {
            System.out.println("Вес авто:" + loadCapacity.body);
        }

    }

    @Override
    public boolean service() {
        return Math.random()>0.7;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" починен!");

    }


    @Override
    public void pitStop() {
        System.out.println(super.getBrand()+" "+ super.getModel()+" "+ PIT);
    }

    @Override
    public void bestLapTime() {
        System.out.println(BEST+": "+super.getBrand()+" "+ super.getModel() );
    }

    @Override
    public void maxSpeed() {
        System.out.println(SPEED+": "+super.getBrand()+" "+ super.getModel() );
    }

    @Override
    public String toString() {
        return "transport.Truck{} " + super.toString() +", вес "+ loadCapacity.body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}
