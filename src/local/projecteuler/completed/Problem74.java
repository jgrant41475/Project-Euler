package local.projecteuler.completed;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johng on 7/15/2016.
 */
public class Problem74 {
    public Problem74() {
        int counter = 0;
        for(int i = 1; i < 1000000; i++) {
            if(factorialChain(i) == 60)
                counter++;
        }

        System.out.println("Found " + counter + " numbers with chain length of 60.");
    }

    private static int factorialChain(int num) {
        int count = 0;
        List<Integer> chainList = new ArrayList<>();

        while (!chainList.contains(num)) {
            chainList.add(num);
            num = factorialSum(num);
            count++;
        }

        return count;
    }

    private static int factorialSum(int number) {
        int sum = 0;
        String numAsString = String.valueOf(number);

        for(int i = 0; i < numAsString.length(); i++) {
            int partialSum = 1;
            for(int j = Character.getNumericValue(numAsString.charAt(i)); j > 0; j--) {
                partialSum *= j;
            }

            sum += partialSum;
        }

        return sum;
    }
}
