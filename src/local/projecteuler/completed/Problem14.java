package local.projecteuler.completed;

/**
 * Created by johng on 6/1/2016.
 */
public class Problem14 {
    public Problem14() {
        int longestChain = 0;
        int startingNum = 0;

        for(int i = 1; i <= 1000000; i++) {
            int c = collatzChain(i);

            if(c > longestChain) {
                longestChain = c;
                startingNum = i;
            }
        }

//        System.out.println("Longest Colatz chain: " + startingNum + " | " + longestChain);
        System.out.println("Answer: " + startingNum);
    }

    public int collatzChain(long num) {
        int chainLen = 1;

        for(int i = 1; ; i++) {

            if(num == 1 || num == 0) {
                chainLen = i;
                break;
            }

            if(num%2 == 0) {
                num = num/2;
            }

            else {
                num = (3 * num) +1;
            }
        }

        return chainLen;
    }

}
