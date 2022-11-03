package transport;

public class Bus extends Transport implements Competing{


    public Bus(String brand, String model, float volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public void startMoving() {
        System.out.println(super.getBrand()+" начать движение!!");
    }

    @Override
    public void finishMoving() {
        System.out.println(super.getBrand()+" закончить движение!!");
    }

    public void Refill() {
        System.out.println("Нужно заправлять бензином или дизелем на заправке.");
    }
    @Override
    public String toString() {
        return "transport.Bus{} " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
        }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public void pitStop() {
        System.out.println(super.getBrand()+" "+ super.getModel()+" "+ PIT);
    }

    @Override
    public void bestLapTime() {
        System.out.println(BEST+" "+super.getBrand()+" "+ super.getModel() );
    }

    @Override
    public void maxSpeed() {
        System.out.println(SPEED+" "+super.getBrand()+" "+ super.getModel() );
    }
}
