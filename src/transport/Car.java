package transport;

import java.util.Objects;

public class Car extends Transport implements Competing {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");


        BodyType(String body) {
        }

    }
        public BodyType bodyType;



        public BodyType getBodyType() {
            return bodyType;
        }

        public void setBodyType(BodyType bodyType) {
            this.bodyType = bodyType;
        }




        public Car(String brand, String model, float volumeEngine, BodyType bodyType) {
            super(brand, model, volumeEngine);
            this.bodyType = bodyType;
        }

        @Override
        public void Refill() {
            System.out.println("Заправить авто!");
        }

        @Override
        public void startMoving() {
            System.out.println(super.getBrand() + " начать движение!!");
        }

        @Override
        public void finishMoving() {
            System.out.println(super.getBrand() + " закончить движение!!");
        }

        @Override
        public String toString() {
            return "transport.Car{} " + super.toString()+"  "+ this.bodyType.name();
        }


        @Override
        public void pitStop() {
            System.out.println(super.getBrand() + " " + super.getModel() + " " + PIT);
        }

        @Override
        public void bestLapTime() {
            System.out.println(BEST + ": " + super.getBrand() + " " + super.getModel());
        }

        @Override
        public void maxSpeed() {
            System.out.println(SPEED + ": " + super.getBrand() + " " + super.getModel());
        }
    }
