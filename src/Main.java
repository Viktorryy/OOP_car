public class Main {
    public static void main(String[] args) {

        Cars[] car = new Cars[5];
        car[0] = new Cars("Lada"," Granta", 1.7f ,"желтый", 2015 ,"Россия");
        car[1] = new Cars("Audi", "A8 50 L TDI quattro", 3.0f , "черный" , 2020 , "Германия");
        car[2] = new Cars("BMW", "Z8",3.0f , "черный" ,2021 , "Германия");
        car[3] = new Cars("Kia", "Sportage 4-го поколения", 2.4f , "красный", 2018 , "Южная Корея");
        car[4] = new Cars("Hyundai", "Avante",1.6f  ,"оранжевый", 2016, "Южная Корея");

        for (Cars i: car) {
            System.out.println(Cars.infoCar(i));
        }

    }
}