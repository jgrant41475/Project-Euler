package local.projecteuler.completed;

/**
 * Created by johng on 6/1/2016.
 */
public class Problem6 {
    public Problem6() {
        int sumOfSquares = 0, squareOfSums = 0;

        for(int i = 1; i <= 100; i++) {
            sumOfSquares += i * i;
            squareOfSums += i;
        } squareOfSums *= squareOfSums;

        System.out.println("Answer: " + (squareOfSums - sumOfSquares));
    }
}
