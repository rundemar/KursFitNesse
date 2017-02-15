package eg;

public class Addition {

    private double digitA, digitB;

    public void setDigitA(double digitA) { this.digitA = digitA; }

    public void setDigitB(double digitB) {
        this.digitB = digitB;
    }

    public double sum() { return digitA+digitB; }
}
