package transport;

import java.util.Objects;

public abstract class Transport {
    private  String brand;
    private  String model;
    private float volumeEngine;

    private String colorBody;
    private  int yearProduction;
    private  String productionCountry;
    private int speedMax;


    public Transport(String brand, String model,
                     float volumeEngine) {
        this.brand = brand;
        this.model = model;
        this.volumeEngine = volumeEngine;

        this.colorBody = validOrDefault(colorBody, "Default");
        this.yearProduction = yearProduction;
       this.productionCountry = productionCountry;
        this.speedMax = speedMax > 0 ? speedMax : 0;
    }

    public Transport(String brand, String model) {
        this.brand = "Default";
        this.model = "Default";
    }

    public static String validOrDefault(String value, String valueDefault) {
        if (value == null || value.isBlank()) {
            return valueDefault;
        } else {
            return value;
        }
    }


    public  String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(float volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void Refill();

    public abstract void startMoving();

    public abstract void finishMoving();


    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volumeEngine='" + volumeEngine ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.getVolumeEngine(), getVolumeEngine()) == 0 && Objects.equals(getBrand(), transport.getBrand()) && Objects.equals(getModel(), transport.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getVolumeEngine());
    }
}
