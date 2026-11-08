import java.util.*;

public class LongestConsecutive {
    static int longest(int[] a) {
        Set<Integer> seen = new HashSet<>();
        for (int v : a) seen.add(v);
        int best = 0;
        for (int v : seen) {
            if (v != Integer.MIN_VALUE && seen.contains(v - 1)) continue;
            int length = 1, current = v;
            while (current != Integer.MAX_VALUE && seen.contains(current + 1)) {
                current++;
                length++;
            }
            best = Math.max(best, length);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
