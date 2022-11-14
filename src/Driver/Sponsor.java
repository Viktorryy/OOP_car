package Driver;

public class Sponsor {
    private final String name;
    private final int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;


    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return  name + ", " + " сумма поддержки: " + amount;
    }

    public void toSponsorRase(){
        System.out.printf("Спонсор %s проспонсировал заезд на %d%n",name,amount);
    }

}
