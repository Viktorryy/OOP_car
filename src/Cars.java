import java.util.Objects;

public class Cars {
    private String brand;
    private String model;
    private float volumeEngine;
    private String colorBody;
    private int yearProduction;
    private String productionCountry;

    public Cars(String brand, String model, float volumeEngine, String colorBody, int yearProduction, String productionCountry) {
        this.brand = validOrDefault(brand, "Default");
        this.model = validOrDefault(model, "Default");
        this.volumeEngine = volumeEngine >= 0 ? volumeEngine : 0;
        this.colorBody = validOrDefault(colorBody, "Белый");
        this.yearProduction = yearProduction >= 0 ? yearProduction : 0;
        this.productionCountry = validOrDefault(productionCountry, "Default");
    }

    private String validOrDefault(String value, String valueDefault) {
        if (value == null || value.isBlank()) {
            return valueDefault;
        } else {
            return value;
        }


    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(float volumeEngine) {
        this.volumeEngine = volumeEngine;
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

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }


    public String toString(Cars cars) {
        return "Cars{" +
                "brand='" + cars.getBrand() + '\'' +
                ", model='" + cars.getModel() + '\'' +
                ", volumeEngine=" + cars.getVolumeEngine() +
                ", colorBody='" + cars.getColorBody() + '\'' +
                ", yearProduction=" + cars.getYearProduction() +
                ", productionCountry='" + cars.getProductionCountry() + '\'' +
                '}';
    }

    public static String infoCar(Cars cars) {
        return
                "brand=" + cars.getBrand() +
                        ", model=" + cars.getModel() +
                        ", volumeEngine=" + cars.getVolumeEngine() +
                        ", colorBody=" + cars.getColorBody() +
                        ", yearProduction=" + cars.getYearProduction() +
                        ", productionCountry=" + cars.getProductionCountry();


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars cars = (Cars) o;
        return Float.compare(cars.getVolumeEngine(), getVolumeEngine()) == 0 && getYearProduction() == cars.getYearProduction() && getBrand().equals(cars.getBrand()) && getModel().equals(cars.getModel()) && getColorBody().equals(cars.getColorBody()) && getProductionCountry().equals(cars.getProductionCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getVolumeEngine(), getColorBody(), getYearProduction(), getProductionCountry());
    }
}
