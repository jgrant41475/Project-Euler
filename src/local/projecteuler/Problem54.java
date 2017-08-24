package local.projecteuler;

import local.projecteuler.lib.Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by johng on 6/21/2016.
 */
public class Problem54 {

    public Problem54() {

//        List<String> allHands = getFile("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem54.txt");
        // "8C TC KC 9C 4C 7D 2S 5D 3S AC"

        String p1 = "8C TC KC 9C 4C 7D 2S 5D 3S AC";

        Arrays.stream(splitHand(p1)).forEach(System.out::println);

    }

    private static String[] splitHand(String raw) {
        String[] hands = new String[]{"", ""};

        String[] temp = raw.split(" ");
        for(int i = 0; i < temp.length; i++) {
            if(i < 5)
                hands[0] += temp[i] + " ";
            else
                hands[1] += temp[i] + " ";
        }

        return hands;
    }

    private static List<String> getFile(String filePath) {
        List<String> lines = Core.getFileAsArray(filePath);

        return lines;
    }

    private static int getScore(String hand) {

        return 0;
    }

    private static boolean isStraightFlush(String hand) {
        return false;
    }

    private static boolean isFourKind(String hand) {
        return false;
    }

    private static boolean isFlush(String hand) {
        return false;
    }

    private static boolean isThreeKind(String hand) {
        return false;
    }

    private static boolean isPair(String hand) {
        return false;
    }

    private static int getHighCard(String hand) {
        return 0;
    }
}
