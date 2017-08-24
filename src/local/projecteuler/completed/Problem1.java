package local.projecteuler.completed;

/**
 * Created by johng on 6/1/2016.
 */
public class Problem1 {
    public Problem1() {
        int result = 0;

        for(int i = 1; i< 1000; i++)
            if(i % 3 == 0 || i % 5 == 0)
                result+=i;

        System.out.println("Answer: " + result);
    }
}
