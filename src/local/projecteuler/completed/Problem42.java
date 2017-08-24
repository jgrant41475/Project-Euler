package local.projecteuler.completed;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem42 {

    private static ArrayList<Integer> triangleNumbers = getTriangleNumbers(20);

    public Problem42() {
        try(Stream<String> stream = Files.lines(Paths.get("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\problem42.txt"))) {

            final int[] triangleWords = {0};
            Arrays.stream(stream.toArray()[0].toString().replace("\"", "").split(",")).forEach(e -> {
                if(isTriangleWord(e))
                    triangleWords[0]++;
            });
            System.out.println(triangleWords[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isTriangleWord(String word) {
        int sum = 0;

        for(int i = 0; i < word.length(); i++)
            sum += Integer.valueOf(word.charAt(i)) - 64;

        int finalSum = sum;
        final boolean[] isTriangle = {false};
        triangleNumbers.forEach(e -> {
            if(e == finalSum)
                isTriangle[0] = true;
        });

        return isTriangle[0];
    }

    private static ArrayList<Integer> getTriangleNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++ ) {
            list.add((int) ((.5)* i * (i+1)));
        }
        return list;
    }
}
