import java.util.*;

public class ContinuousSubarraySum {
    static boolean hasMultiple(int[] a, int k) {
        Map<Long, Integer> first = new HashMap<>();
        first.put(0L, -1);
        long sum = 0, divisor = Math.abs((long) k);
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            long key = divisor == 0 ? sum : ((sum % divisor) + divisor) % divisor;
            if (first.containsKey(key)) {
                if (i - first.get(key) >= 2) return true;
            } else {
                first.put(key, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasMultiple(new int[]{23, 2, 4, 6, 7}, 6));
    }
}
