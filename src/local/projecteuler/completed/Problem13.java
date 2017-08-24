package local.projecteuler.completed;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by johng on 6/4/2016.
 */
public class Problem13 {
    public Problem13() {
        System.out.println(Paths.get("").toAbsolutePath().toString());
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\problem13.txt"))) {
            final BigInteger[] sum = {new BigInteger("0")};
            stream.forEach(e -> {
                BigInteger c = new BigInteger(e);
                sum[0] = sum[0].add(c);
            });
            System.out.println(sum[0]);

            System.out.println("Answer: " + sum[0].toString().substring(0,10));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
