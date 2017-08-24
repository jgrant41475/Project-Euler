package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by johng on 7/17/2016.
 */
public class Problem41 {

    public Problem41() {
        long largest = 0;
        for(long i = 1000; i < 8000000; i = Primes.getNextPrime(i)) {
            if(isPandigital(Long.toString(i))) {
                System.out.println("Found: " + i);
                if(i > largest)
                    largest = i;
            }

        }

        System.out.println("The largest pandigital prime is " + largest);
    }

    private static boolean isPandigital(String seq) {

        for(int i = 1; i <= seq.length(); i++) {
            if(!seq.contains(String.valueOf(i)))
                return false;
        }

        return true;

    }
}
