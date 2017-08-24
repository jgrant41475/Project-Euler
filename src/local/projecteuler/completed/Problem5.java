package local.projecteuler.completed;

import java.util.ArrayList;

/**
 * Created by johng on 6/3/2016.
 */
public class Problem5 {

    public Problem5() {
        ArrayList<Long> divisors = new ArrayList<>();
        for(long i = 1; i<=20; i++)
            divisors.add(i);

        for (long i = 2, size = divisors.size(); i < 10000000000L; i++) {
            int a = 0;
            for(long d : divisors)
                if (i % d == 0) a++;

            if(a == size) {
                System.out.println("Answer: " + i);
                break;
            }
        }
    }

}
