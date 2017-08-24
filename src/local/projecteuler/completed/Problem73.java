package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

import java.util.*;


/**
 * Created by johng on 7/15/2016.
 *
 * Needs optimizing.  Takes about 30 minutes
 */
public class Problem73 {
    private HashMap<Long, ArrayList<Long>> sieve = new HashMap<>();
    public Problem73() {
        int counter = 0;
        for(int denominator = 1; denominator <= 12000; denominator++) {
            for(int numerator = 1; numerator <= denominator/2; numerator++) {
                if((numerator % 2 == 0 && denominator % 2 == 0))
                    continue;
                double quotient = (double)numerator / denominator;
                if(quotient > (double)1/3 && quotient < (double) 1/2) {
                    if(highestCommonFactor(numerator,denominator) == 1) {
                        counter++;
                        System.out.println("Found: " + numerator + "/" + denominator + " -> " + quotient);
                    }
                }
            }
        }
        System.out.println("Found " + counter + " proper fractions between 1/3 and 1/2 for d <= 12000");
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
