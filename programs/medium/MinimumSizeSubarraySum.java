public class MinimumSizeSubarraySum {
    // Works when all array values are positive.
    static int minLength(int[] a, int target) {
        int left = 0, sum = 0, best = a.length + 1;
        for (int right = 0; right < a.length; right++) {
            sum += a[right];
            while (sum >= target) {
                best = Math.min(best, right - left + 1);
                sum -= a[left++];
            }
        }
        return best == a.length + 1 ? 0 : best;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2, 4, 3};
        System.out.println(minLength(a, 7));
    }
}
