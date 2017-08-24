package local.projecteuler.completed;

import local.projecteuler.lib.Primes;

import java.util.*;

/**
 * Created by johng on 7/9/2016.
 */
public class Problem124 {
    public Problem124() {
        Map<Long, Long> unSortedMap = new HashMap<>();
        for (long i = 1; i <= 100000; i++) {
            long sum = Primes.primeFactorTree(i).stream()
                    .distinct()
                    .reduce(1L, (a, b) -> a * b);
            unSortedMap.put(i, sum);
        }

        LinkedList<Long> list = new LinkedList<>();
        list.add(0L);
        unSortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> list.add(e.getKey()));
        System.out.println("Answer: " + list.get(10000));
    }
}
