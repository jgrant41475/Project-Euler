package local.projecteuler;

import java.util.HashMap;

/**
 * Created by johng on 7/7/2016.
 */
public class Problem23 {

    private HashMap<Integer, Boolean> abundantNumbersSieve = new HashMap<>();

    public Problem23() {
//        populateSieve();
        System.out.println(sumOfProperDivisors(16));
    }

    private void populateSieve() {
        for (int n = 9; n < 20; n++) {
            if(sumOfProperDivisors(n) > n) {
                System.out.println("Found abundant number: " + n);
            }
        }
    }

    private static int sumOfProperDivisors(int n) {
        int sqrt = (int) Math.sqrt(n);
        int sum = 0;
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                System.out.println("Found: " + i + " " + (int)(n / i));
                sum += i + (n / i);
            }
        }

        return sum - n;
    }

    private boolean isNonAbundant(int n) {
        int sqrt = (int) Math.sqrt(n);
        int sum = 0;
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                System.out.println("Found: " + i + " " + (n / i));
                sum += i + (n / i);
            }
        }

        return sum - n == n;
    }

}
