import java.util.Arrays;

public class KthLargestQuickSelect {
    static int kthLargest(int[] nums, int k) {
        if (k < 1 || k > nums.length) throw new IllegalArgumentException("Invalid k");
        int[] a = Arrays.copyOf(nums, nums.length);
        int target = a.length - k, l = 0, r = a.length - 1;
        while (l <= r) {
            int pivot = a[r], p = l;
            for (int i = l; i < r; i++) {
                if (a[i] <= pivot) {
                    int t = a[i]; a[i] = a[p]; a[p] = t;
                    p++;
                }
            }
            int t = a[p]; a[p] = a[r]; a[r] = t;
            if (p == target) return a[p];
            if (p < target) l = p + 1;
            else r = p - 1;
        }
        throw new IllegalStateException();
    }

    public static void main(String[] args) {
        System.out.println(kthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
