import java.util.*;

public class LargestRectangleHistogram {
    static int largest(int[] h) {
        Deque<Integer> indices = new ArrayDeque<>();
        int best = 0;
        for (int i = 0; i <= h.length; i++) {
            int height = i == h.length ? 0 : h[i];
            while (!indices.isEmpty() && h[indices.peek()] > height) {
                int bar = h[indices.pop()];
                int left = indices.isEmpty() ? -1 : indices.peek();
                best = Math.max(best, bar * (i - left - 1));
            }
            if (i < h.length) indices.push(i);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[]{2, 1, 5, 6, 2, 3}));
    }
}
