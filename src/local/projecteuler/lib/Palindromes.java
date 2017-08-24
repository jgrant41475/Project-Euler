package local.projecteuler.lib;

/**
 * Created by johng on 6/3/2016.
 */
public class Palindromes {
    public static boolean isPalindrome(String number) {
        String a = "", b = "";

        if(number.length() % 2 == 0) {
            int middle = number.length()/2;

            a = number.substring(0, middle);
            b = number.substring(middle);

        } else {
            int middle = (number.length()/2);

            a = number.substring(0, middle);
            b = number.substring(middle+1);
        }

        String temp = new String();
        for(int i = b.length()-1; i >= 0; i--)
            temp += b.charAt(i);
        b = temp;

        return (a.compareTo(b) == 0) ? true : false;
    }
}
