public class MaxConsecutiveOnesIII {
    // At most k zeros can be changed to ones.
    static int longest(int[] a, int k) {
        if (k < 0) throw new IllegalArgumentException("k must be nonnegative");
        int left = 0, zeros = 0, best = 0;
        for (int right = 0; right < a.length; right++) {
            if (a[right] == 0) zeros++;
            while (zeros > k) {
                if (a[left] == 0) zeros--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }
}
