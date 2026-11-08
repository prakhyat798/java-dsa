import java.util.*;

public class SlidingWindowMaximum {
    static int[] maximums(int[] a, int k) {
        if (k < 1 || k > a.length) return new int[0];
        Deque<Integer> q = new ArrayDeque<>();
        int[] ans = new int[a.length - k + 1];
        for (int i = 0; i < a.length; i++) {
            while (!q.isEmpty() && q.peekFirst() <= i - k) q.removeFirst();
            while (!q.isEmpty() && a[q.peekLast()] <= a[i]) q.removeLast();
            q.addLast(i);
            if (i >= k - 1) ans[i - k + 1] = a[q.peekFirst()];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maximums(a, 3)));
    }
}
