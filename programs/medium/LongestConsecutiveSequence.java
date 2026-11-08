import java.util.HashSet;

public class LongestConsecutiveSequence {
    static int longest(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : a) set.add(value);
        int best = 0;
        for (int value : set) {
            if (value != Integer.MIN_VALUE && set.contains(value - 1)) continue;
            int length = 1, current = value;
            while (current != Integer.MAX_VALUE && set.contains(current + 1)) {
                current++;
                length++;
            }
            if (length > best) best = length;
        }
        return best;
    }

    public static void main(String[] args) {
        int[] a = {100, 4, 200, 1, 3, 2};
        System.out.println(longest(a));
    }
}
