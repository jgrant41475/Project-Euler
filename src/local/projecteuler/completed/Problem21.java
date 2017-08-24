package local.projecteuler.completed;

import java.util.*;

/**
 * Created by johng on 6/28/2016.
 */
public class Problem21 {

    private HashMap<Integer, Integer> sieve = new HashMap<>();

    public Problem21() {
        int total = 0;
        for(int i = 1; i < 10000; i++) {
            int temp = sumOfProperDivisors(i);
            if(temp >= 1)
                sieve.put(i, temp);
        }

        Iterator iter = sieve.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry pair = (Map.Entry) iter.next();
            if(sieve.containsKey(pair.getValue())) {
                int k = (int) pair.getValue();
                int v = sieve.get(k);
                if(pair.getKey().equals(v) && !pair.getKey().equals(k)) {
                    total += (int) pair.getKey();
                    System.out.println("Found pair: " + pair.getKey() + " " + k);
                }
            }
        }

        System.out.println("Answer: " + total);
    }

    private int sumOfProperDivisors(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);

        for(int i = 1; i <= sqrt; i++) {
            if(n % i == 0) {
                int temp = n / i;
                sum += temp + (n / temp);
            }
        }

        return sum - n;
    }
}
