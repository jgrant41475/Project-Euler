package local.projecteuler.completed;

/**
 * Created by johng on 6/2/2016.
 */
public class Problem40 {
    public Problem40() {
        String stringOfNumbers = "";

        for(int i = 1; i < 200000; i++)
            stringOfNumbers += Integer.toString(i);

        int d1, d10, d100, d1000, d10000, d100000, d1000000;

        d1          = Integer.valueOf(stringOfNumbers.charAt(0));
        d10         = Integer.valueOf(stringOfNumbers.charAt(9));
        d100        = Integer.valueOf(stringOfNumbers.charAt(99));
        d1000       = Integer.valueOf(stringOfNumbers.charAt(999));
        d10000      = Integer.valueOf(stringOfNumbers.charAt(9999));
        d100000     = Integer.valueOf(stringOfNumbers.charAt(99999));
        d1000000    = Integer.valueOf(stringOfNumbers.charAt(999999));

        System.out.println("Answer: " +
                    d1 * d10 * d100 * d1000 * d10000 * d100000 * d1000000
        );
    }
}
