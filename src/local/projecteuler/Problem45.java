package local.projecteuler;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by johng on 6/5/2016.
 */
public class Problem45 {
    public Problem45() {
        HashMap<Integer, Long> tMap = new HashMap<>();
        HashMap<Integer, Long> pMap = new HashMap<>();
        HashMap<Integer, Long> hMap = new HashMap<>();

        for(int i = 100000; i < 1000000; i++) {
            tMap.put(i, getTriangleNumer(i));
            pMap.put(i, getPentagonalNumber(i));
            hMap.put(i, getHexagonalNumber(i));
        }

        System.out.println("Sieve complete.");

        tMap.forEach((i, val) -> {
            if(pMap.containsValue(val) && hMap.containsValue(val))
                System.out.println("Found: " + val + " at index: " + i);
        });
    }

    private static long getTriangleNumer(int n) {
        return (n * (n + 1)) / 2;
    }

    private static long getPentagonalNumber(int n) {
        return (n * ((3 * n) - 1)) / 2;
    }

    private static long getHexagonalNumber(int n) {
        return n * ((2 * n) - 1);
    }
}
