package eg;

import java.util.ArrayList;
import java.util.List;

public class Tickets {

    private int ageA, ageB;

    public void setAgeA(int ageA) {
        this.ageA=ageA;
    }

    public void setAgeB(int ageB) {
        this.ageB=ageB;
    }

    public int calculateTotalAmount() {

        int totalAmount = 0;

        List<Integer> ages = new ArrayList<>();
        ages.add(ageA);
        ages.add(ageB);

        for (int age : ages) {
            if (age < 16) {
                totalAmount += 22;
            } else if(age == 20) {
                return 100;
            }else if (age > 16 && age < 65) {
                totalAmount += 35;
            }  else {
                totalAmount += 15;
            }
        }
        return totalAmount;
    }
}
