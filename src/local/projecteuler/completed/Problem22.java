package local.projecteuler.completed;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by johng on 6/5/2016.
 */
public class Problem22 {
    public Problem22() {

        try(Stream<String> stream = Files.lines(Paths.get("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem22.txt"))) {
            List<String> names = Arrays.stream(stream.toArray()[0].toString().replace("\"", "").split(",")).collect(Collectors.toList());
            Collections.sort(names);
            long sumOfNames = 0;

            for(int i = 0; i < names.size(); i++)
                sumOfNames += getScore(names.get(i)) * (i+1);

            System.out.println("Answer: " + sumOfNames);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long getScore(String name) {
        long score = 0;

        for(int i = 0; i < name.length(); i++)
            score += Integer.valueOf(name.charAt(i)) - 64;

        return score;
    }
}
