import transport.Cars;

public class Main {
    public static void main(String[] args) {

        Cars[] car = new Cars[5];
        car[0] = new Cars("Lada"," Granta", 1.7f ,"желтый", 2015 ,"Россия","","" ,"",0,"summer",false,null,0d,"");
        car[1] = new Cars("Audi", "A8 50 L TDI quattro", 3.0f , "черный" , 2020, "Германия","","" ,"",0,"summer",false,null,0d,"");
        car[2] = new Cars("BMW", "Z8",3.0f , "черный" ,2021 , "Германия","","" ,"",0,"summer",false,null,0d,"");
        car[3] = new Cars("Kia", "Sportage 4-го поколения", 2.4f , "красный", 2018 , "Южная Корея","","" ,"",0,"summer",false,null,0d,"");
        car[4] = new Cars("Hyundai", "Avante",1.6f  ,"оранжевый", 2016, "Южная Корея","","" ,"",0,"summer",false,null,0d,"");


        car[2].setRubberSign(Cars.changeWheels(car[2].getRubberSign()));

        for (Cars i: car) {
            System.out.println(Cars.infoCar(i));
        }
        car[2].setRegistrationNumber("f123gs42256");
        System.out.println(Cars.infoCar(car[2]));




    }
}