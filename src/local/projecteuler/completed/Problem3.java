package local.projecteuler.completed;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by johng on 6/2/2016.
 */
public class Problem3 {
    public Problem3() {

        primeFactorTree(600851475143L).forEach(System.out::println);

    }

    public ArrayList<Long> primeFactorTree(long number) {
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

    public static boolean isPrime(long number) {
        long sqrt = (long) Math.sqrt(number);

        for(long i = 2; i <= sqrt; i++) {
            if(number%i == 0)
                return false;
        }

        return true;
    }

    private static ArrayList<Integer> getPrimes(int n) {
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

}
