package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by johng on 7/7/2016.
 */
public class Problem27 {

    private HashMap<Integer, Boolean> sieve = new HashMap<>();

    public Problem27() {

        int lastLargest = 0;
        int lastLargestProduct = 0;

        for(int a = -999; a < 1000; a++) {
            for(int b = -999; b < 1000; b++) {
                if(!sieve.containsKey(b)) {
                    if(!Primes.isPrime(b)) {        // b is not prime, therefore result of n=0 will also not be prime.
                        continue;
                    }
                    else {
                        sieve.put(b, true);
                    }
                }

                int numberOfPrimes = getConsecutiveNumberOfPrimes(a, b);

                if(numberOfPrimes > lastLargest) {
                    System.out.println("Found: a=" + a + " b=" + b + " Number of primes: " + numberOfPrimes + " product: " + a*b);
                    lastLargest = numberOfPrimes;
                    lastLargestProduct = a * b;
                }
            }
        }

        System.out.println("\nThe product of the coefficients, a and b, which produces " + lastLargest + " consecutive primes is " + lastLargestProduct);
    }

    private int getConsecutiveNumberOfPrimes(int a, int b) {
        int primesFound = 0;

        for(int n = 0, result = 0; n < 100; n++, primesFound++) {
            result = (n*n) + (a * n) + b;

            if(!sieve.containsKey(result)) {
                if(Primes.isPrime(result))
                    sieve.put(result, true);
                else
                    break;
            }
            else {
                if(!sieve.get(result))
                    break;
            }
        }

        return primesFound;
    }
}
