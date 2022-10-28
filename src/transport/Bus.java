package transport;

public class Bus extends Transport{


    public Bus(String brand, String model, String colorBody, int yearProduction, String productionCountry, int speedMax) {
        super(brand, model, colorBody, yearProduction, productionCountry, speedMax);
    }

    @Override
    public String toString() {
        return "transport.Bus{} " + super.toString();
    }

    @Override
    public void Refill() {
        System.out.println("Нужно заправлять бензином или дизелем на заправке.");
    }
}
