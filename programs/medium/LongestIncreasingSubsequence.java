import java.util.Arrays;

public class LongestIncreasingSubsequence {
    static int length(int[] a) {
        int[] tails = new int[a.length];
        int size = 0;
        for (int value : a) {
            int l = 0, r = size;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (tails[mid] < value) l = mid + 1;
                else r = mid;
            }
            tails[l] = value;
            if (l == size) size++;
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(length(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}
