package local.projecteuler.completed;

/**
 * Created by johng on 6/23/2016.
 */
public class Problem92 {
    public Problem92() {
        int nTrue = 0;
        int nFalse = 0;
        for(int i = 1; i <= 10000000; i++) {
            if(cubeChain(i))
                nTrue++;
            else
                nFalse++;
        }
        System.out.println("Chains ending in 1: " + nTrue + " Chains ending in 89: " + nFalse);
    }

    private static boolean cubeChain(long num) {
        while(true) {
            if(num == 1 || num == 89)
                break;

            String numAsString = Long.toString(num);
            long sum = 0;
            for(int i = 0; i < numAsString.length(); i++)
                sum += Math.pow(Character.getNumericValue(numAsString.charAt(i)), 2);

            num = sum;
        }
        return num == 1 ? true : false;
    }
}
