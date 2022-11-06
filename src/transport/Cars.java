package transport;

import java.time.LocalDate;
import java.util.Objects;

//public class Cars extends Transport {

//    private float volumeEngine;
//    private String transmission;
//    private String bodyType;
//    private String registrationNumber;
//    private int numberOfSeats;
//    private String rubberSign;
//    private Key key;
//    private Insurance insurance;

//    public Cars(String audi, String brand, float v1, String model, float volumeEngine,
//                String германия, String s1, String s, String colorBody, int yearProduction,
//                String summer, boolean b, Object o, double v, String productionCountry) {
//        this(brand,  model,volumeEngine,
//                colorBody, yearProduction,
//                productionCountry,
//                "Default",
//                "Default",
//                "х000хх000",
//                5,
//                "summer",
//                new Key(),
//                new Insurance()
//        );

//        public Cars(String brand, String model, float volumeEngine,
//                String colorBody, int yearProduction,
//                String productionCountry, String transmission,
//                String bodyType, String registrationNumber,
//                int numberOfSeats, String rubberSign, Key key, Insurance insurance) {
//        super.brand = brand;
//        super.model = validOrDefault(model, "Default");
//        this.volumeEngine = volumeEngine > 0 ? volumeEngine : 0;
//            super.colorBody = validOrDefault(colorBody, "Белый");
//            super.yearProduction = yearProduction > 0 ? yearProduction : 2000;
//            super.productionCountry = validOrDefault(productionCountry, "Default");
//
//        this.transmission = validOrDefault(transmission, "automatic");
//        this.bodyType = validOrDefault(bodyType, "Default");
//        this.registrationNumber = validOrDefault(registrationNumber, "х000хх000");
//        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 0;
//        this.rubberSign = validOrDefault(rubberSign, "summer");
//if (key == null) {
//        this.key = new Key();
//    } else {
//        this.key = key;
//    }
//        if (insurance == null) {
//        this.insurance = new Insurance();
//    } else {
//        this.insurance = insurance;
//    }
//
//}

//    public Cars(String brand, String model, String colorBody,
//                int yearProduction, String productionCountry,
//                int speedMax, float volumeEngine,
//                String transmission, String bodyType,
//                String registrationNumber, int numberOfSeats,
//                String rubberSign ) {
//        super(brand, model, colorBody, yearProduction,
//                productionCountry, speedMax);
//        this( 0f, "Default",
//                "Default",
//                "х000хх000",
//                5,
//                "summer"
//        );
//    }


//    public Cars(String brand, String model, String colorBody,
//                int yearProduction, String productionCountry,
//                int speedMax, float volumeEngine,
//                String transmission, String bodyType,
//                String registrationNumber, int numberOfSeats,
//                String rubberSign, Key key, Insurance insurance) {
//        super(brand, model, colorBody, yearProduction,
//                productionCountry, speedMax);
//        this.volumeEngine = volumeEngine > 0 ? volumeEngine : 0;
//        this.transmission = validOrDefault(transmission, "automatic");
//        this.bodyType = validOrDefault(bodyType, "Default");
//        this.registrationNumber = validOrDefault(registrationNumber, "х000хх000");
//        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 0;
//        this.rubberSign = validOrDefault(rubberSign, "summer");
//
//        if (key == null) {
//            this.key = new Key();
//        } else {
//            this.key = key;
//        }
//
//        if (insurance == null) {
//            this.insurance = new Insurance();
//        } else {
//            this.insurance = insurance;
//        }
//
//    }
//
//
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        this.key = key;
//    }
//
//    public Insurance getInsurance() {
//        return insurance;
//    }
//
//    public void setInsurance(Insurance insurance) {
//        this.insurance = insurance;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        if (isCorrectRegNumber(registrationNumber)) {
//            System.out.println("Регистрационный номер" + registrationNumber);
//            this.registrationNumber = registrationNumber;
//        } else {
//            System.out.println("Регистрационный номер не верный");
//        }
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//
//    public String getRubberSign() {
//        return rubberSign;
//    }
//
//    public void setRubberSign(String rubberSign) {
//        this.rubberSign = rubberSign;
//    }
//
//
//    public float getVolumeEngine() {
//        return volumeEngine;
//    }
//
//    public void setVolumeEngine(float volumeEngine) {
//        this.volumeEngine = volumeEngine;
//    }
//
//
//    public static String changeWheels(String rubber) {
//        if (rubber == "summer") {
//            rubber = "winter";
//        } else {
//            rubber = "summer";
//
//        }
//        return rubber;
//    }
//
//
//    public boolean isCorrectRegNumber(String registrationNumber) {
//        // х000хх000
//        if (registrationNumber.length() != 9) {
//            return false;
//        }
//        char[] chars = registrationNumber.toCharArray();
//
//        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])
//                || !Character.isAlphabetic(chars[5])) {
//
//            return false;
//        }
//        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
//                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
//
//            return false;
//        }
//
//        return true;
//    }
//
//
//    public void Refill() {
//        System.out.println("Можно заправлять бензином, дизелем на заправке.");
//        System.out.println("Можно заряжать на специальных электропарковках, если это электрокар.");
//    }
//
//    public static String infoCar(Cars cars) {
//        return
//                "brand=" + cars.getBrand() +
//                        ", model=" + cars.getModel() +
//                        ", volumeEngine=" + cars.getVolumeEngine() +
//                        ", colorBody=" + cars.getColorBody() +
//                        ", yearProduction=" + cars.getYearProduction() +
//                        ", productionCountry=" + cars.getProductionCountry() +
//                        ", transmission='" + cars.transmission + '\'' +
//                        ", bodyType='" + cars.bodyType + '\'' +
//                        ", registrationNumber='" + cars.registrationNumber + '\'' +
//                        ", numberOfSeats=" + cars.numberOfSeats +
//                        ", rubberSign='" + cars.rubberSign +
//                        ", Key = " + (cars.getKey().isWithoutKeyAccess() ? " безключевой доступ," : " доступ ключем,") +
//                        (cars.getKey().isRemoteRunEngine() ? " удаленный запуск," : " обычный запуск,") +
//                        " Insurance: № " + cars.getInsurance().getNumber() +
//                        ", стоимость: " + cars.getInsurance().getCost() +
//                        ", дата действия " + cars.getInsurance().getExpierDate();
//
//    }
//
//    public static class Key {
//        private final boolean remoteRunEngine;
//        private final boolean withoutKeyAccess;
//
//        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
//            this.remoteRunEngine = remoteRunEngine;
//            this.withoutKeyAccess = withoutKeyAccess;
//        }
//
//        public Key() {
//            this(false, false);
//        }
//
//        public boolean isRemoteRunEngine() {
//            return remoteRunEngine;
//        }
//
//        public boolean isWithoutKeyAccess() {
//            return withoutKeyAccess;
//        }
//
//        @Override
//        public String toString() {
//            return "transport.Cars.Key{" +
//                    "remoteRunEngine=" + remoteRunEngine +
//                    ", withoutKeyAccess=" + withoutKeyAccess +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Key)) return false;
//            Key key = (Key) o;
//            return isRemoteRunEngine() == key.isRemoteRunEngine() && isWithoutKeyAccess() == key.isWithoutKeyAccess();
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(isRemoteRunEngine(), isWithoutKeyAccess());
//        }
//    }
//
//
//
//
//    public static class Insurance {
//        private final LocalDate expierDate;
//        private final int cost;
//        private final String number;
//
//        public Insurance(LocalDate expierDate, int cost, String number) {
//            if (expierDate == null) {
//                this.expierDate = LocalDate.now().plusDays(365);
//            } else {
//                this.expierDate = expierDate;
//            }
//
//            this.cost = cost > 0 ? cost : 0;
//            this.number = Transport.validOrDefault(number, "123456789");
//        }
//
//        public Insurance() {
//            this(null, 0, null);
//        }
//
//        public LocalDate getExpierDate() {
//            return expierDate;
//        }
//
//        public double getCost() {
//            return cost;
//        }
//
//        public String getNumber() {
//            return number;
//        }
//
//        public void checkExpierDate() {
//            if (expierDate.isAfter(LocalDate.now()) || expierDate.isEqual(LocalDate.now())) {
//                System.out.println("Нужно срочно оформлять новую страховку");
//            }
//        }
//
//        public void checkNumber() {
//            if (number.length() != 9 || number.isEmpty()) {
//                System.out.println("Номер страховки некорректный!");
//            }
//        }
//
//        @Override
//        public String toString() {
//            return "transport.Cars.Insurance{" +
//                    "expierDate=" + expierDate +
//                    ", cost=" + cost +
//                    ", number='" + number + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Insurance)) return false;
//            Insurance insurance = (Insurance) o;
//            return getCost() == insurance.getCost() && Objects.equals(getExpierDate(), insurance.getExpierDate()) && Objects.equals(getNumber(), insurance.getNumber());
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(getExpierDate(), getCost(), getNumber());
//        }
//    }
//}
