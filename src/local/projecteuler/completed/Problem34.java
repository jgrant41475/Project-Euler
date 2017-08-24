package local.projecteuler.completed;

import java.util.HashMap;

/**
 * Created by johng on 6/18/2016.
 */
public class Problem34 {
    private HashMap<Integer, Integer> sieve = new HashMap<>();
    // 2540161
    public Problem34() {
        sieve.put(0, 1);
        sieve.put(1, 1);
        sieve.put(2, 2);
        sieve.put(3, 6);
        sieve.put(4, 24);
        sieve.put(5, 120);
        sieve.put(6, 720);
        sieve.put(7, 5040);
        sieve.put(8, 40320);
        sieve.put(9, 362880);

        int sum = 0;
        for(int i = 3; i < 1000000; i++) {
            if(digitFactorial(i) == i)
                sum += i;
        }

        System.out.println("Answer: " + sum);
    }

    private int digitFactorial(int n) {
        int sum = 0;
        String nAsString = String.valueOf(n);
        for(int i = 0; i < nAsString.length(); i++)
            sum += factorial(Integer.parseInt(String.valueOf(nAsString.charAt(i))));

        return sum;
    }

    private int factorial(int n) {
        return sieve.get(n);
    }
}
