package transport;

public class Car extends Transport implements Competing{
    public Car(String brand, String model, float volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public void Refill() {
        System.out.println("Заправить авто!");
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
        return "transport.Car{} " + super.toString();
    }


    @Override
    public void pitStop() {
        System.out.println(super.getBrand()+" "+ super.getModel()+" "+ PIT);
    }

    @Override
    public void bestLapTime() {
        System.out.println(BEST+": "+ super.getBrand()+" "+ super.getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println(SPEED+": "+super.getBrand()+" "+ super.getModel() );
    }
}
