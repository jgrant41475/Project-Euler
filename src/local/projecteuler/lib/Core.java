package local.projecteuler.lib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by johng on 6/21/2016.
 */
public class Core {
    public static List<String> getFileAsArray(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            if(lines.size() != 0)
                return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<String>();
//        try(Stream<String> stream = Files.lines(Paths.get("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem59.txt"))) {
//            ArrayList<String> tempList = new ArrayList<>();
//            for(Object c : stream.toArray()) {
//                tempList.add((String) c);
//            }
//            return (String[]) tempList.toArray();
////            String[] array = (String[]) stream.toArray();
////            System.out.println(array[0]);
////            return new String[]{"H"};
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new String[] {"Unable to retrieve file."};
//        }
    }
}
