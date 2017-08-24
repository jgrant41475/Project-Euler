package local.projecteuler.completed;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by johng on 7/9/2016.
 */
public class Problem145 {
    public Problem145() {
        Set<Long> sieve = new HashSet<>();
        for(long i = 10; i < Math.pow(10, 9); i++) {
            long rev = reverse(i);
            long sum = i + rev;

            if(sieve.contains(sum) || sieve.contains(rev) || i % 10 == 0)
                continue;

            if(containsAllOdd(sum)) {
                System.out.println("Found: " + i + " and " + rev);
                sieve.add(i);
                sieve.add(rev);
            }
        }

        System.out.println("There are " + sieve.size() + " reversible numbers below 10^9");
    }

    private static boolean containsAllOdd(long n) {
        String nAsString = String.valueOf(n);
        for(int i = 0; i < nAsString.length(); i++) {
            int c = Character.getNumericValue(nAsString.charAt(i));
            if(c % 2 == 0)
                return false;
        }
        return true;
    }

    private static long reverse(long n) {
        String nAsString = String.valueOf(n);
        String temp = "";

        for(int i = nAsString.length()-1; i > -1; i--) {
            temp += nAsString.charAt(i);
        }

        return Long.valueOf(temp);
    }
}
