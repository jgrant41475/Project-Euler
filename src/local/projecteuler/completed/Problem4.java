package local.projecteuler.completed;

/**
 * Created by johng on 6/2/2016.
 */
public class Problem4 {
    public Problem4() {
        int largest = 0;
        for (int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                int temp = i * j;
                if(isPalindrome(String.valueOf(temp)) && temp > largest)
                    largest = temp;
            }
        }

        System.out.println("Largest palindrome: " + largest);
    }

    private static boolean isPalindrome(String number) {
        String a, b;

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
