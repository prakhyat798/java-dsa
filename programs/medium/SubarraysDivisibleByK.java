import java.util.*;

public class SubarraysDivisibleByK {
    static long count(int[] a, int k) {
        if (k <= 0) throw new IllegalArgumentException("k must be positive");
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);
        long answer = 0, prefix = 0;
        for (int value : a) {
            prefix += value;
            int rem = (int) ((prefix % k + k) % k);
            answer += freq.getOrDefault(rem, 0);
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }
}
