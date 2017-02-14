package eg;

/**
 * Created by rundemar on 14.02.2017.
 */
public class Tickets {

    private double price, numberOfTravelers;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfTravelers(double numberOfTravelers) {
        this.numberOfTravelers = numberOfTravelers;
    }

    public double totalPrice() {
        return price*numberOfTravelers;
    }
}
