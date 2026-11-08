import java.util.Arrays;

public class SearchRange {
    static int lowerBound(int[] a, int target) {
        int l = 0, r = a.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] < target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    static int upperBound(int[] a, int target) {
        int l = 0, r = a.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] <= target) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    static int[] range(int[] a, int target) {
        int first = lowerBound(a, target);
        if (first == a.length || a[first] != target) return new int[]{-1, -1};
        return new int[]{first, upperBound(a, target) - 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(range(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}
