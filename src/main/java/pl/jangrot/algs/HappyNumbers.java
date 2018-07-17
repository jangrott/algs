package pl.jangrot.algs;

import java.util.*;

public class HappyNumbers {

    public static boolean isHappyNumber(int n) {
        Set<Integer> visited = new HashSet<>();
        do {
            visited.add(n);
            List<Integer> units = new ArrayList<>();
            while (n > 0) {
                units.add(n % 10);
                n /= 10;
            }
            Collections.reverse(units);
            n = units.stream().mapToInt(i -> (int) Math.pow(i, 2)).sum();

            if (n == 1) {
                return true;
            }
        } while (!visited.contains(n));

        return false;
    }
}
