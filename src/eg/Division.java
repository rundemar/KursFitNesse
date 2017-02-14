package eg;

/**
 * Created by rundemar on 17.01.2017.
 */
public class Division {

    private double numerator, denominator;

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public double quotient() {
        return numerator/denominator;
    }
}
