package local.projecteuler.completed;

import local.projecteuler.lib.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by johng on 6/26/2016.
 */
public class Problem89 {

    private HashMap<String, Integer> romanMap = new HashMap<>();

    public Problem89() {
        List<String> roman = Core.getFileAsArray("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem89.txt");
        final int[] difference = {0};

        roman.stream().forEach(e -> {
            String min = e.replaceAll("(DCCCC|VIIII|LXXXX|IIII|XXXX|CCCC)", "kk");
            difference[0] += e.length() - min.length();
            System.out.println("Old: " + e + " New : " + min);
        });

        System.out.println("Difference: " + difference[0]);



        // Generate All the necessary Roman Numerals => decimal pairs
//        romanMap.put("IV", 4);
//        romanMap.put("IX", 9);
//        romanMap.put("XL", 40);
//        romanMap.put("XC", 90);
//        romanMap.put("CD", 400);
//        romanMap.put("CM", 900);
//        romanMap.put("I", 1);
//        romanMap.put("V", 5);
//        romanMap.put("X", 10);
//        romanMap.put("L", 50);
//        romanMap.put("C", 100);
//        romanMap.put("D", 500);
//        romanMap.put("M", 1000);
//
//        List<String> roman = Core.getFileAsArray("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem89.txt");
//
//        int difference = 0;
//        for(String c : roman) {
//            int oldLen = c.length();
//            int newLen = toRoman(fromRoman(c)).length();
//
//            difference += (oldLen - newLen);
//
//            System.out.println("Old: " + c + " New: " + toRoman(fromRoman(c)) + " Difference: " + (oldLen - newLen));
//        }
//
//        System.out.println("Saved: " + difference);

//        System.out.println("result: " + fromRoman(""));
//        System.out.println(toRoman(99));
    }

    private int fromRoman(String roman) {
        int romanAsNum = 0;

        Pattern subtractiveCombinationRegex = Pattern.compile("(I(V|X)|X(L|C)|C(D|M))");
        Matcher subtractiveMatcher = subtractiveCombinationRegex.matcher(roman);
        Pattern romanRegex = Pattern.compile("(I|V|X|L|C|D|M)");
        Matcher romanMatcher = null;

        while(subtractiveMatcher.find()) {
            String match = subtractiveMatcher.group(1);
            if(romanMap.containsKey(match))
                romanAsNum += romanMap.get(match);
        }
        roman = subtractiveMatcher.replaceAll("");

        romanMatcher = romanRegex.matcher(roman);

        while(romanMatcher.find()) {
            String match = romanMatcher.group(1);
            if(romanMap.containsKey(match))
                romanAsNum += romanMap.get(match);
        }

        return romanAsNum;
    }

    private String toRoman(int number) {
        String roman = "";

        while(number > 999) {
            roman += "M";
            number -= 1000;
        }

        if(number > 899 && number < 1000) {
            roman += "CM";
            number -= 900;
        }

        if(number > 499) {
            roman += "D";
            number -= 500;
        }
        else if(number > 399 && number < 499) {
            roman += "CD";
            number -= 400;
        }

        while(number > 99) {
            roman += "C";
            number -= 100;
        }

        if(number > 89) {
            roman += "XC";
            number -= 90;
        }

        else if(number > 49) {
            roman += "L";
            number -= 50;
        }

        while(number >= 10) {
            roman += "X";
            number -= 10;
        }

        switch (number) {
            case 9:
                roman += "IX";
                break;
            case 8:
                roman += "VIII";
                break;
            case 7:
                roman += "VII";
                break;
            case 6:
                roman += "VI";
                break;
            case 5:
                roman += "V";
                break;
            case 4:
                roman += "IV";
                break;
            case 3:
                roman += "III";
                break;
            case 2:
                roman += "II";
                break;
            case 1:
                roman += "I";
                break;
        }

        return roman;
    }

}
