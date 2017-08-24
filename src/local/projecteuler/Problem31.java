package local.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by johng on 3/8/2017.
 */
public class Problem31 {
    public Problem31() {
        int[] coins = {1, 2 ,5, 10, 20, 50, 100, 200};

        int ways = 0;

        for(int i = coins.length - 1; i >= 0; i--) {
            System.out.println("Checking: " + i);


        }

        System.out.println("The number of different ways £2 can be made via the use of European coins is: " + ways);
    }
}
