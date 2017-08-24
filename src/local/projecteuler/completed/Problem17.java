package local.projecteuler.completed;

/**
 * Created by johng on 6/2/2016.
 */
public class Problem17 {
    public Problem17() {
        int sum = 0;
        for(int i = 1; i < 1001; i++)
            sum += writeNumber(i).length();
        System.out.println("Answer: " + sum);
    }

    public static String writeNumber(int num) {
        String sNumber = "";
        if(num == 0)
            return "";
        if(num < 21) {
            if (num == 1)
                return "one";
            else if (num == 2)
                return "two";
            else if (num == 3)
                return "three";
            else if (num == 4)
                return "four";
            else if (num == 5)
                return "five";
            else if (num == 6)
                return "six";
            else if (num == 7)
                return "seven";
            else if (num == 8)
                return "eight";
            else if (num == 9)
                return "nine";
            else if (num == 10)
                return "ten";
            else if (num == 11)
                return "eleven";
            else if (num == 12)
                return "twelve";
            else if (num == 13)
                return "thirteen";
            else if (num == 14)
                return "fourteen";
            else if (num == 15)
                return "fifteen";
            else if (num == 16)
                return "sixteen";
            else if (num == 17)
                return "seventeen";
            else if (num == 18)
                return "eighteen";
            else if (num == 19)
                return "nineteen";
        }

        if(num < 100) {
            int a = Integer.parseInt(Integer.toString(num).substring(0,1));
            String temp = "";
            if(a == 2)
                temp = "twenty";
            if(a == 3)
                temp = "thirty";
            else if(a == 4)
                temp = "forty";
            else if(a == 5)
                temp = "fifty";
            else if(a == 6)
                temp = "sixty";
            else if(a == 7)
                temp = "seventy";
            else if(a == 8)
                temp = "eighty";
            else if(a == 9)
                temp = "ninety";

            return temp + writeNumber( Integer.parseInt( Integer.toString(num).substring(1) ) );
        }

        else if(num < 1000) {
            int a = Integer.parseInt(Integer.toString(num).substring(0,1));
            String b = Integer.toString(num).substring(1);

            return writeNumber(a) + (b.equals("00")?"hundred":"hundredand" + writeNumber(Integer.parseInt(b)));
        }

        else if(num == 1000)
            return "onethousand";
        else
            return sNumber;
    }
}
