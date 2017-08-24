package local.projecteuler.completed;

import local.projecteuler.lib.Core;

import java.util.*;

/**
 * Created by johng on 6/23/2016.
 */
public class Problem79 {
    public Problem79() {
        List<String> file = Core.getFileAsArray("C:\\Users\\johng\\IdeaProjects\\Project Euler\\src\\local\\projecteuler\\Problem74.txt");
        Set<String> set = new HashSet<>();

        file.stream()
//                .mapToInt(e -> Integer.parseInt(e))
                .forEach(set::add);

//        System.out.println("Size: " + file.size());
//        set.forEach(System.out::println);
//        System.out.println("Size: " + set.size());

        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        sortedList.forEach(System.out::println);
        System.out.println("Size: " + sortedList.size());

    }
}
