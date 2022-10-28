package transport;

public abstract class Transport {
    private  String brand;
    private  String model;
    private String colorBody;
    private  int yearProduction;
    private  String productionCountry;
    private int speedMax;


    public Transport(String brand, String model, String colorBody,
                     int yearProduction, String productionCountry,
                     int speedMax) {
        this.brand = brand;
        this.model = model;
        this.colorBody = validOrDefault(colorBody, "Default");
        this.yearProduction = yearProduction;
        this.productionCountry = productionCountry;
        this.speedMax = speedMax > 0 ? speedMax : 0;
    }

    public Transport(String brand, String model,
                     String productionCountry
    ) {
        this("Default", "Default", "Default",
                0, "Default", 0);
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

    public String getColorBody() {
        return colorBody;
    }

    public void setColorBody(String colorBody) {
        this.colorBody = colorBody;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    @Override
    public String toString() {
        return "transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colorBody='" + colorBody + '\'' +
                ", yearProduction=" + yearProduction +
                ", productionCountry='" + productionCountry + '\'' +
                ", speedMax=" + speedMax +
                '}';
    }

    public abstract void Refill();


}
