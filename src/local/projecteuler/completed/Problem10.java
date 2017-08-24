package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem10 {
    public Problem10() {
        long sum = 0;
        for(int i = 2; i<=2000000; i++)
            if(Primes.isPrime(i))
                sum += i;

        System.out.println("Answer: " + sum);
    }
}
