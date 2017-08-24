package local.projecteuler;

/**
 * Created by johng on 6/29/2016.
 */
public class Problem407 {
    public Problem407() {
        long total = 0;
        long limit = 90000;

        for(long n = 1; n < limit; n++) {
            if(n % 10000 == 0) {
                System.out.println("n = " + n + " " + ((float)n/limit*100) + "% complete.");
            }
            long lastLargest = 0;
            for (long a = 0; a < n; a++) {

                long c = (a * a) % n;
                if (c == a % n && c > lastLargest) {
//                    System.out.println("Found: " + c + " at index: " + a);

                    if(c > lastLargest)
                        lastLargest = c;
                }

            }
            total += lastLargest;
        }
        System.out.println("Sum of function M(n) for 1 <= n <= 10^7 = " + total);
    }
}
