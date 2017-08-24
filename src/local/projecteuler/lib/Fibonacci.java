package local.projecteuler.lib;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by johng on 6/4/2016.
 */
public class Fibonacci {
    public static ArrayList<Long> getSequence(int n) {
        ArrayList<Long> sequence = new ArrayList<>();

        if(n == 1)
            sequence.add((long) 1);
        else if(n > 1) {
            Collections.addAll(sequence, (long) 1, (long) 1);
            long f1 = 1,f2 = 1;
            for(long i = 2, temp = 0; i<n; i++) {
                temp = f1 + f2;

                sequence.add(temp);
                f1 = f2;
                f2 = temp;
            }
        }

        return sequence;
    }
}
