package transport;

public class Truck extends Transport implements Competing{


    public enum LoadCapacity {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

       LoadCapacity(String body) {
        }
    }
    public Truck(String brand, String model, float volumeEngine, LoadCapacity loadCapacity) {
        super(brand, model, volumeEngine);
        this.loadCapacity=loadCapacity;
    }

    public LoadCapacity loadCapacity;
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
    public String toString() {
        return "transport.Truck{} " + super.toString() +" "+ this.loadCapacity.name();
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


}
