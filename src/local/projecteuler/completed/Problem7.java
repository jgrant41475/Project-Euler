package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

/**
 * Created by johng on 6/3/2016.
 */
public class Problem7 {
    public Problem7() {
        for(long i = 2, count = 0; ; i++) {
            if(Primes.isPrime(i))
                count++;

            if(count == 10001) {
                System.out.println("Answer: " + i);
                break;
            }
        }
    }
}
