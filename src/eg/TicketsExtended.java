package eg;

/**
 * Created by rundemar on 14.02.2017.
 */
public class TicketsExtended {

    private double age;

    public void setAge(double age) {
        this.age = age;
    }

    public double totalPrice() {
        if(age < 16){
            System.out.println("Less than 16");
        }else if (age > 16){
            System.out.println("More than 16");
        }
        return 0;
    }
}

//priceChild, priceAdult, priceSenior