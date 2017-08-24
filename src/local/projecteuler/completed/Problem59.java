package local.projecteuler.completed;


import local.projecteuler.lib.Core;

import java.util.ArrayList;

/**
 * Created by johng on 6/21/2016.
 */
public class Problem59 {
    public Problem59() {
        System.out.println("Program Start.");

        /*
         *  Prints out all combinations of possible three lettered cypher codes.
         *  Parses result set for any combinations that contain the phrase 'The', once found halts process and stores
         *  the cypher code into a string to be used later.
         *
         */

        String[] combinations = getCombinations();
        int[] encrypted = new int[] {79,59,12,2,79,35,8,28,20,2,3,68,8,9,68};
        String cypher = "";

        for(int i = 0; i < 17576; i++) {
            String c = combinations[i];
            String decrypted = decrypt(encrypted, c);
            if(decrypted != "" && decrypted.charAt(0) > 39) {
                if (decrypted.contains("The")) {
                    System.out.println("Found match, cypher: " + c + " | Message: " + decrypted);
                    cypher = c;
                    break;
                }
            }
        }

        /*
         *  Once cypher has been determined, retrieve the entire encrypted ASCII code,
         *  call the decrypter and parse the return String for the original ASCII values and sum them.
         */


        String[] encryptedAsciiArray = getFile();
        int[] encryptedArray = new int[encryptedAsciiArray.length];
        for(int i = 0; i < encryptedAsciiArray.length; i++)
            encryptedArray[i] = Integer.parseInt(encryptedAsciiArray[i]);

        String originalText = decrypt(encryptedArray, cypher);

        int sum = 0;
        for(int i = 0; i < originalText.length(); i++)
            sum += originalText.charAt(i);

        System.out.println("Answer: " + sum);
    }


    private static String[] getFile() {
        ArrayList<String> file = (ArrayList<String>) Core.getFileAsArray("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem59.txt");
        return file.get(0).toString().split(",");
    }

    private static String encrypt(String text, String cypher) {
        String result = "";
        for(int i = 0, counter = 1; i < text.length(); i++, counter++) {
            if(counter > 3) counter = 1;
            char c = text.charAt(i);
            char cyperChar = cypher.charAt(counter-1);

            result += (c ^ cyperChar) + ",";
        }
        return result.substring(0, result.length()-1);
    }

    private static String decrypt(int[] encryptedText, String cypher) {
        String decryptedText = "";

        for(int i = 0, counter = 1; i < encryptedText.length; i++, counter++) {
            if(counter > 3) counter = 1;
            char c = (char) (cypher.charAt(counter-1) ^ encryptedText[i]);

            if((int)c > 122 || (int)c < 32) {
                decryptedText = "";
                break;
            }

            decryptedText += c;
        }

        return decryptedText;
    }

    private static String[] getCombinations() {
        String[] allCombos = new String[17576];
        int counter = 0;

        for(char i = 'a'; i <= 'z'; i++) {
            String cache = String.valueOf(i);
            for(char k = 'a'; k <= 'z'; k++) {
                String cache2 = String.valueOf(k);
                for(char l = 'a'; l <= 'z'; l++)
                    allCombos[counter++] = cache + cache2 + String.valueOf(l);
            }
        }

        return allCombos;
    }
}
