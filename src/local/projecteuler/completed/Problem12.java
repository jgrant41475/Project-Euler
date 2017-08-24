package local.projecteuler.completed;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem12 {

    public Problem12() {
        List<Integer> triangleNumbers = new ArrayList<>();
        int lastTriangle = 1;
        for(int i = 2; i < 100000; i++) {
            lastTriangle += i;
            triangleNumbers.add(lastTriangle);
        }

        for(int i = 0; i < triangleNumbers.size(); i++) {
            if(getDivisors(triangleNumbers.get(i)) > 500) {
                System.out.println("Found: " + triangleNumbers.get(i));
                break;
            }
        }

        System.out.println("Program complete.");

    }

    public int getDivisors(long num) {
        int divisors = 0;
        int sqrt = (int) Math.sqrt(num);

        for(int i = 1; i <= sqrt; i++) {
            if(num % i == 0)
                divisors+= 2;
        }

        return divisors;
    }

}
