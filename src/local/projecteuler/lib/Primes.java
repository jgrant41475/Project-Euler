package local.projecteuler.lib;

import java.util.ArrayList;

/**
 * Created by johng on 6/3/2016.
 */
public class Primes {

    public static boolean isPrime(long number) {
        if(number < 2)
            return false;

        if(number == 2)
            return true;

        if(number % 2 == 0)
            return false;

        for(int i = 3; i*i <= number; i+=2) {
            if(number%i == 0)
                return false;
        }

        return true;
    }

    public static ArrayList<Long> primeFactorTree(long number) {
        ArrayList<Integer> primes = getPrimes(1000);
        ArrayList<Long> tree = new ArrayList<>();

        for(int i = 0, size = primes.size(); i < size; i++) {
            if(isPrime(number)) {
                tree.add(number);
                break;
            }

            int p = primes.get(i);

            if(number % p == 0) {
                tree.add((long) p);
                number /= p;
                i = -1;
            }
        }

        return tree;
    }

    public static long getNextPrime(long previous) {
        long nPrime = 0;

        if(previous < 1)
            return nPrime;

        for(long i = previous+1; ; i++) {
            if(isPrime(i)) {
                nPrime = i;
                break;
            }
        }

        return nPrime;
    }

    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        if(n < 1)
            return list;

        for(int i = 2, count = 0; count < n ;i++ ) {
            if(isPrime(i)) {
                list.add(i);
                count++;
            }
        }

        return list;
    }

    public static ArrayList<Long> getPrimes(long n) {
        ArrayList<Long> list = new ArrayList<>();

        if(n < 1)
            return list;

        for(long i = 2, count = 0; count < n ;i++ ) {
            if(isPrime(i)) {
                list.add(i);
                count++;
            }
        }

        return list;
    }
}
