package eg;

public class GroupTickets {

    private double price;
    private int numberOfTravelers, ageOfYoungestTraveler;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfTravelers(int numberOfTravelers) {
        this.numberOfTravelers = numberOfTravelers;
    }

    public void setAgeOfYoungestTraveler(int ageOfYoungestTraveler) { this.ageOfYoungestTraveler = ageOfYoungestTraveler; }

    public double totalAmount() {
        if (ageOfYoungestTraveler < 10) {
            return (price * numberOfTravelers)*0.85;
        } else {
            return price * numberOfTravelers;
        }
    }
}
