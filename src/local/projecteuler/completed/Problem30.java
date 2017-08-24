package local.projecteuler.completed;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem30 {
    public Problem30() {
        long sum = 0;
        for(int i = 2; i < 10000000; i++) {
            String iString = Integer.toString(i);
            long powerSum = 0;
            for(int k = 0; k < iString.length(); k++)
                powerSum += Math.pow(Integer.parseInt(iString.substring(k, k+1)), 5);

            if(powerSum == i)
                sum += i;
        }

        System.out.println("Answer: " + sum);
    }
}
