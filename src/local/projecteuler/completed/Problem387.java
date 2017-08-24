package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johng on 6/23/2016.
 *
 *  Solution to the Project Eueler Problem #387
 *
 *  @TODO:
 *  Solution works but the current algorithm requires a very long time to compute.  Nearly an entire day atleast.
 *  Needs to be seriously optimized...
 */
public class Problem387 {

    private List<Long> listOfKnownHarshads = new ArrayList<>();
    private List<Long> listOfKnownStrongs = new ArrayList<>();
    private List<Long> listOfKnownRights = new ArrayList<>();

    public Problem387() {

        long sum = 0;
        long limit = (long) Math.pow(10,14);

        for(long i = 2, counter = 0; i < limit; counter++) {
            long c = Primes.getNextPrime(i);
            if(isStrongRightTruncatableHarshadPrime(c))
                sum += c;

            i = c;
            if(counter % 1000000 == 0)
                System.out.println("Iteration: " + counter + " i: " + i + " Progress: " + ((float)i / (float) limit * 100) + "% complete");
        }

        System.out.println("Sum Strong, Right Truncatable Harshad Primes less than " + limit + ": " + sum);

    }

    private boolean isStrongRightTruncatableHarshadPrime(long num) {
        if(num < 100)
            return false;
        // Assume number is prime...

        String numAsString = Long.toString(num);
        long numTruncated = Long.parseLong(numAsString.substring(0, numAsString.length()-1));

        if(!Primes.isPrime(numTruncated/sumOfDigits(numTruncated)))
            return false;

        else if(!isRightTruncatableHarshad(num))
            return false;

        else if(!isStrongHarshad(numTruncated))
            return false;

        else if(!isHarshad(numTruncated))
            return false;

        return true;
    }

    private boolean isHarshad(long num) {
        if(listOfKnownHarshads.contains(num))
            return true;

        else if(num % sumOfDigits(num) == 0) {
            listOfKnownHarshads.add(num);
            return true;
        }

        return false;
}

    private boolean isStrongHarshad(long num) {
        if(listOfKnownStrongs.contains(num))
            return true;

        if(!isHarshad(num))
            return false;

        if(Primes.isPrime(num/sumOfDigits(num)))
            return true;

        listOfKnownStrongs.add(num);
        return false;
    }

    private boolean isRightTruncatableHarshad(long num) {

        if(listOfKnownRights.contains(num))
            return true;

        String numAsString = Long.toString(num);
        for(int i = numAsString.length()-1; i > 0; i--) {
            if(!isHarshad(Integer.parseInt(numAsString.substring(0,i))))
                return false;
        }

        listOfKnownRights.add(num);
        return true;
    }

    private static int sumOfDigits(long num) {
        int sum = 0;
        String numAsString = Long.toString(num);
        for(int i = 0; i < numAsString.length(); i++)
            sum += Character.getNumericValue(numAsString.charAt(i));

        return sum;
    }
}
