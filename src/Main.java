import Driver.DriverB;
import Driver.Mechanic;
import Driver.Sponsor;
import transport.*;

import java.util.List;
//import transport.Cars;


public class Main {
    public static void main(String[] args) {

//        Cars[] car = new Cars[5];
//        car[0] = new Cars("Lada"," Granta", "желтый", 2015 ,
//                "Россия", 0 ,1.7f,"" ,
//                "","",0,"summer",
//                null,null);
//        car[1] = new Cars("Audi", "A8 50 L TDI quattro", "черный",2020,
//                "Германия" ,0,3.0f  , "", "",
//                "",0 ,"summer",
//                null,null);
//        car[2] = new Cars("BMW", "Z8","черный" , 2021,
//                "Германия" , 0,3.0f, "",
//                "","",0,"summer",
//                null,null);
//        car[3] = new Cars("Kia", "Sportage 4-го поколения", "красный", 2018 ,
//                "Южная Корея",0,2.4f , "","",
//                "",0,"summer",null,null);
//       car[4] = new Cars("Hyundai", "Avante","оранжевый",2016,
//               "Южная Корея",0,1.6f  , "" ,"",
//               "",0,"summer",null,null);
//
//
//      car[2].setRubberSign(Cars.changeWheels(car[2].getRubberSign()));
//
//
//        System.out.println("     Машины");
//        for (Cars i: car) {
//            System.out.println(Cars.infoCar(i));
//        }
//        car[2].setRegistrationNumber("f123gs42256");
//        System.out.println(Cars.infoCar(car[2]));
//
//        car[2].Refill();

        Train[] train = new Train[2];
//        train[0]= new Train("Поезд «Ласточка»", "модель B-901", "",
//                2011, "Россия", 301, 3500,
//                10,"Белорусский вокзал", "Минск-Пассажирский",
//                11);
//
//        train[1] = new Train("Поезд «Ленинград»", "модель D-125", 100,
//                2019 , "Россия",  270, 1700,
//                10,"Ленинградский вокзал", "Ленинград-Пассажирский",
//                8);


//        System.out.println("     Поезда");
//        for (Train j: train) {
//            System.out.println(j);
//        }
        //    train[0].Refill();


        Mechanic<Car> ivan = new Mechanic<Car>("Иван", "Иванов", "SSS");
        Mechanic<Truck> anton = new Mechanic<Truck>("Антон", "Сидоров", "ККК");
        Mechanic<Bus> petr = new Mechanic<Bus>("Петр", "Петров", "Shell");
        Sponsor geitz = new Sponsor("Билл Гейтс", 20_000_000);
        Sponsor bill = new Sponsor("Билли", 20_000_000);
        Sponsor mishlin = new Sponsor("Mishlin", 15_000_000);
        Sponsor shell = new Sponsor("Shell", 10_000_000);

        Bus[] bus = new Bus[3];
        bus[0] = new Bus("Икарус", "000", 200, Bus.BusCapacity.B2);
        bus[0].addMechanic(petr);
        bus[0].addSponsor(shell);

        bus[1] = new Bus("Mercedes", "111", 150, Bus.BusCapacity.B5);
        bus[2] = new Bus("Газель", "222", 180, Bus.BusCapacity.B3);


        System.out.println("     Автобусы");
        for (Bus j : bus) {
            System.out.println(j);
            j.startMoving();
            j.pitStop();
        }
        // bus[0].Refill();
        Truck[] truck = new Truck[3];
        truck[0] = new Truck("КАМАЗ", "000", 500, Truck.LoadCapacity.N2);
        truck[0].addMechanic(anton);
        truck[0].addSponsor(mishlin);
        truck[1] = new Truck("DAF", "111", 550, Truck.LoadCapacity.N1);
        truck[2] = new Truck("MAN", "222", 600, Truck.LoadCapacity.N3);


        System.out.println("     Грузовики");
        for (Truck j : truck) {
            System.out.println(j);
            j.startMoving();
            j.bestLapTime();
        }


        Car[] car = new Car[3];
        car[0] = new Car("Audi", "A8 (D5) ", 280, Car.BodyType.SUV);
        car[0].addMechanic(ivan);
        car[0].addSponsor(geitz);
        car[0].addSponsor(bill);

        car[1] = new Car("Mercedes-Benz", " CLA AMG C118 AMG ", 310, Car.BodyType.CROSSOVER);
        car[2] = new Car("BMW", "8 Gran Coupe G15 ", 320, Car.BodyType.SUV);


        System.out.println("     Легковые автомобили");
        for (Car j : car) {
            System.out.println(j);
            j.startMoving();
            j.maxSpeed();
        }

        service(car[0], car[1], car[2],
                truck[0], truck[1],truck[2],
                bus[0], bus[1]
        );

        List<Transport> transports = List.of(
                car[0], truck[0],  bus[0]
        );

        for (Transport t:transports) {
            printInfo(t);
        }
       // printInfo();

        DriverB[] driverB = new Driver.DriverB[2];
        driverB[0] = new Driver.DriverB("Фернандо Алонсо", 21, car[0]);

     //   System.out.println(driverB[0]);


        Driver.DriverD[] driverD = new Driver.DriverD[2];
        driverD[0] = new Driver.DriverD("Себастьян Феттель", 11, bus[1]);
      //  System.out.println(driverD[0]);


        Driver.DriverC[] driverC = new Driver.DriverC[2];
        driverC[0] = new Driver.DriverC("Валттери Боттас", 11, truck[2]);
      //  System.out.println(driverC[0]);




    }
    private static void printInfo(Transport transport){
        System.out.println("    Информация по автомобилю "+transport.getBrand()+" "+transport.getModel() );
        System.out.println("Спонсоры: "+ transport.getSponsors());
//        for (Sponsor sponsor: transport.getSponsors()){
//            System.out.println(sponsor.getName());
//        }
        System.out.println("Механики: " +transport.getMechanics());
//        for (Mechanic<?> mechanic: transport.getMechanics()){
//            System.out.println(mechanic.getName()+" "+mechanic.getSurname()+", из "+mechanic.getCompany());
//        }


    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
    private static void serviceTransport(Transport transport){
            if (!transport.service()) {
                try {
                    throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику!");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }


    }

}
