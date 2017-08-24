package local.projecteuler;

import local.projecteuler.lib.Primes;

import java.util.*;

/**
 * Created by johng on 7/17/2016.
 */
public class Problem72 {
    private HashMap<Long, ArrayList<Long>> sieve = new HashMap<>();
    public Problem72() {
        int counter = 0;
        int limit = 1000000;
        for(int denominator = 2; denominator <= limit; denominator++) {
            for(int numerator = 1; numerator < denominator; numerator++) {
                if(highestCommonFactor(numerator, denominator) == 1) {
                    counter++;
                    System.out.println("Found: " + numerator + "/" + denominator);
                }
            }
        }

        System.out.println("Found " + counter + " Proper reduced fractions for d <= " + limit);
    }

    private int highestCommonFactor(int a, int b) {
        List<Long> aFactors, bFactors;
        if(sieve.containsKey(a))
            aFactors = sieve.get(a);
        else
            aFactors = Primes.primeFactorTree(a);

        if(sieve.containsKey(b))
            bFactors = sieve.get(b);
        else
            bFactors = Primes.primeFactorTree(b);

        Set<Long> common = new HashSet<>();
        common.add(1L);

        aFactors.forEach(e -> {
            if(bFactors.contains(e))
                common.add(e);
        });

        return common.size();
    }
}
