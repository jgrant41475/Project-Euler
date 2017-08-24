package local.projecteuler.completed;

import local.projecteuler.lib.Palindromes;

import java.math.BigInteger;

/**
 * Created by johng on 7/9/2016.
 */
public class Problem55 {
    public Problem55() {
        int lychrelNumbers = 0;
        BigInteger temp;
        for(long startingNumber = 100; startingNumber < 10000; startingNumber++) {
            temp = new BigInteger(String.valueOf(startingNumber));

            for (int i = 0; i < 51; i++) {
                if (i == 50 && !Palindromes.isPalindrome(String.valueOf(temp))) {
                    System.out.println(startingNumber + " is a lychrel number.");
                    lychrelNumbers++;
                    break;
                }

                if (Palindromes.isPalindrome(String.valueOf(temp)) && i != 0) {
//                    System.out.println(startingNumber + " creates palindrome: " + temp + " after " + i + " iterations");
                    break;
                } else {
                    temp = temp.add(reverse(temp));
                }
            }
        }

        System.out.println("Number of lychrel numbers below 10,000 = " + lychrelNumbers);
    }

    private static BigInteger reverse(BigInteger n) {
        String nAsString = n.toString();
        String temp = "";

        for(int i = nAsString.length()-1; i > -1; i--) {
            temp += nAsString.charAt(i);
        }

        return new BigInteger(temp);
    }
}
