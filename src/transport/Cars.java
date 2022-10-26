package transport;

import java.time.LocalDate;

public class Cars {
    private final String brand;
    private final String model;
    private float volumeEngine;
    private String colorBody;
    private final int yearProduction;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String rubberSign;
    private Key key;
    private Insurance insurance;

    public Cars(String brand, String model, float volumeEngine,
                String colorBody, int yearProduction,
                String productionCountry, String transmission,
                String bodyType, String registrationNumber,
                int numberOfSeats, String rubberSign, Key key, Insurance insurance) {
        this.brand = validOrDefault(brand, "Default");
        this.model = validOrDefault(model, "Default");
        this.volumeEngine = volumeEngine > 0 ? volumeEngine : 0;
        this.colorBody = validOrDefault(colorBody, "Белый");
        this.yearProduction = yearProduction > 0 ? yearProduction : 2000;
        this.productionCountry = validOrDefault(productionCountry, "Default");

        this.transmission = validOrDefault(transmission, "automatic");
        this.bodyType = validOrDefault(bodyType, "Default");
        this.registrationNumber = validOrDefault(registrationNumber, "х000хх000");
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 0;
        this.rubberSign = validOrDefault(rubberSign, "summer");

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }

    }
    public Cars(String audi, String brand, float v1, String model, float volumeEngine,
                String германия, String s1, String s, String colorBody, int yearProduction,
                String summer, boolean b, Object o, double v, String productionCountry) {
        this(brand,  model,volumeEngine,
                colorBody, yearProduction,
                productionCountry,
                "Default",
                "Default",
                "х000хх000",
                5,
                "summer",
                new Key(),
                new Insurance()
        );

    }




    private static String validOrDefault(String value, String valueDefault) {
        if (value == null || value.isEmpty()) {
            return valueDefault;
        } else {
            return value;
        }
    }

    public static String changeWheels(String rubber) {
        if (rubber == "summer") {
            rubber = "winter";
        } else {
            rubber = "summer";

        }
        return rubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (isCorrectRegNumber(registrationNumber)) {
            System.out.println("Регистрационный номер" + registrationNumber);
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println("Регистрационный номер не верный");
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    public String getRubberSign() {
        return rubberSign;
    }

    public void setRubberSign(String rubberSign) {
        this.rubberSign = rubberSign;
    }

    public String getBrand() {
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

    @Override
    public String toString() {
        return "transport.Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", colorBody='" + colorBody + '\'' +
                ", yearProduction=" + yearProduction +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", rubberSign='" + rubberSign + '\'' +
                '}';
    }

    public static String infoCar(Cars cars) {
        return
                "brand=" + cars.getBrand() +
                        ", model=" + cars.getModel() +
                        ", volumeEngine=" + cars.getVolumeEngine() +
                        ", colorBody=" + cars.getColorBody() +
                        ", yearProduction=" + cars.getYearProduction() +
                        ", productionCountry=" + cars.getProductionCountry() +
                        ", transmission='" + cars.transmission + '\'' +
                        ", bodyType='" + cars.bodyType + '\'' +
                        ", registrationNumber='" + cars.registrationNumber + '\'' +
                        ", numberOfSeats=" + cars.numberOfSeats +
                        ", rubberSign='" + cars.rubberSign +
                        ", Key = " + (cars.getKey().isWithoutKeyAccess()?" безключевой доступ,":" доступ ключем," )+
                         (cars.getKey().isRemoteRunEngine()?" удаленный запуск,":" обычный запуск," )+
                        " Insurance: № " + cars.getInsurance().getNumber()+
                        ", стоимость: " + cars.getInsurance().getCost()+
                        ", дата действия " + cars.getInsurance().getExpierDate();


    }

    public boolean isCorrectRegNumber(String registrationNumber) {
        // х000хх000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();

        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])
                || !Character.isAlphabetic(chars[5])) {

            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {

            return false;
        }

        return true;
    }


    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expierDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expierDate, double cost, String number) {
            if (expierDate == null) {
                this.expierDate = LocalDate.now().plusDays(365);
            } else {
                this.expierDate = expierDate;
            }

            this.cost = cost <= 0 ? cost : 0;
            this.number = Cars.validOrDefault(number, "123456789");
        }

        public Insurance() {
            this(null, 0, null);
        }

        public LocalDate getExpierDate() {
            return expierDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpierDate() {
            if (expierDate.isAfter(LocalDate.now()) || expierDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9 || number.isEmpty()) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }
}
