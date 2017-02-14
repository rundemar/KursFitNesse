package eg;

/**
 * Created by rundemar on 14.02.2017.
 */
public class Addition {

    private double digitA, digitB;

    public void setDigitA(double digitA) {
        this.digitA = digitA;
    }

    public void setDigitB(double digitB) {
        this.digitB = digitB;
    }

    public double sum() { return digitA+digitB; }
}
