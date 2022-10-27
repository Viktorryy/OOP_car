import transport.Bus;
import transport.Cars;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        Cars[] car = new Cars[5];
        car[0] = new Cars("Lada"," Granta", "желтый", 2015 ,
                "Россия", 0 ,1.7f,"" ,
                "","",0,"summer",
                null,null);
        car[1] = new Cars("Audi", "A8 50 L TDI quattro", "черный",2020,
                "Германия" ,0,3.0f  , "", "",
                "",0 ,"summer",
                null,null);
        car[2] = new Cars("BMW", "Z8","черный" , 2021,
                "Германия" , 0,3.0f, "",
                "","",0,"summer",
                null,null);
        car[3] = new Cars("Kia", "Sportage 4-го поколения", "красный", 2018 ,
                "Южная Корея",0,2.4f , "","",
                "",0,"summer",null,null);
       car[4] = new Cars("Hyundai", "Avante","оранжевый",2016,
               "Южная Корея",0,1.6f  , "" ,"",
               "",0,"summer",null,null);
//
//
      car[2].setRubberSign(Cars.changeWheels(car[2].getRubberSign()));


        System.out.println("     Машины");
        for (Cars i: car) {
            System.out.println(Cars.infoCar(i));
        }
        car[2].setRegistrationNumber("f123gs42256");
        System.out.println(Cars.infoCar(car[2]));

        Train[] train = new Train[2];
        train[0]= new Train("Поезд «Ласточка»", "модель B-901", "",
                2011, "Россия", 301, 3500,
                10,"Белорусский вокзал", "Минск-Пассажирский",
                11);

        train[1] = new Train("Поезд «Ленинград»", "модель D-125", "",
                2019 , "Россия",  270, 1700,
                10,"Ленинградский вокзал", "Ленинград-Пассажирский",
                8);

        System.out.println("     Поезда");
        for (Train j: train) {
            System.out.println(j);
        }

        Bus[] bus = new Bus[3];
        bus[0] = new Bus("Икарус", "000", "Красный", 2000, "Россия", 90);
        bus[1] = new Bus("ПАЗ", "111", "Желтый", 2001, "Россия", 90);
        bus[2] = new Bus("Газель", "222", "белый", 2010, "Россия", 120);


        System.out.println("     Автобусы");
        for (Bus j: bus) {
            System.out.println(j);
        }
    }
}