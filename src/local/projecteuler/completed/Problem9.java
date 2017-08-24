package local.projecteuler.completed;

/**
 * Created by johng on 6/28/2016.
 */
public class Problem9 {
    public Problem9() {
        for(int i = 1; i < 999; i++)
            for(int j = 2; j < 999; j++)
                for(int k = 3; k < 999; k++)
                    if(i + j + k == 1000 && (i*i) + (j*j) == (k*k))
                        System.out.println("Answer: " + (i * j * k));
    }
}
