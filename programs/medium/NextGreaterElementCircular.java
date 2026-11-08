import java.util.*;

public class NextGreaterElementCircular {
    static int[] nextGreater(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!stack.isEmpty() && a[stack.peek()] < a[index])
                ans[stack.pop()] = a[index];
            if (i < n) stack.push(index);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreater(new int[]{1, 2, 1})));
    }
}
