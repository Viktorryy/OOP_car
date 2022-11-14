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

        private final String body;

        BodyType(String body) {
            this.body = body;
        }

    }

    public BodyType bodyType;


    public BodyType getBodyType() {
        return bodyType;
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
    public void definitionType() {
        if (bodyType == null) {
            System.out.println("Данных по авто недостаточно!!");
        } else {
            System.out.println("Тип кузова авто:" + bodyType.body);
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина"+getBrand()+" "+getModel()+" починена!");
    }

    @Override
    public String toString() {
        return "transport.Car{} " + super.toString() + "  " + this.bodyType.body;
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
