package transport;

import java.util.Objects;

public class Train extends Transport {
    private float priceTrip;
    private float travelTime;
    private String departureStation;
    private String endingStation;
    private int amountWagons;

    public Train(String brand, String model, float volumeEngine,
                 String colorBody,
                 int yearProduction, String productionCountry,
                 int speedMax, float priceTrip, float travelTime,
                 String departureStation, String endingStation,
                 int amountWagons) {

        super(brand, model, volumeEngine);
        this.priceTrip = priceTrip > 0f ? priceTrip : 10f;
        this.travelTime = travelTime > 0f ? travelTime : 0;
        this.departureStation = Transport.validOrDefault(departureStation, "Default");
        this.endingStation = Transport.validOrDefault(endingStation, "Default");
        this.amountWagons = amountWagons > 0 ? amountWagons : 0;
    }


    public float getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(float priceTrip) {
        this.priceTrip = priceTrip;
    }

    public float getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(float travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }


    public void Refill() {
        System.out.println("Нужно заправлять дизелем.");
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }

    @Override
    public String toString() {
        return super.toString() +
                "priceTrip=" + priceTrip +
                ", travelTime=" + travelTime +
                ", departureStation='" + departureStation + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", amountWagons=" + amountWagons +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return Float.compare(train.getPriceTrip(), getPriceTrip()) == 0 && Float.compare(train.getTravelTime(), getTravelTime()) == 0 && getAmountWagons() == train.getAmountWagons() && Objects.equals(getDepartureStation(), train.getDepartureStation()) && Objects.equals(getEndingStation(), train.getEndingStation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPriceTrip(), getTravelTime(), getDepartureStation(), getEndingStation(), getAmountWagons());
    }
}