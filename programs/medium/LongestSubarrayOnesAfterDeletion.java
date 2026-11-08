public class LongestSubarrayOnesAfterDeletion {
    // Delete exactly one element, then count the longest run of ones.
    static int longest(int[] a) {
        int left = 0, zeros = 0, best = 0;
        for (int right = 0; right < a.length; right++) {
            if (a[right] == 0) zeros++;
            while (zeros > 1) {
                if (a[left++] == 0) zeros--;
            }
            best = Math.max(best, right - left); // window minus the deletion
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[]{1, 1, 0, 1}));
    }
}
