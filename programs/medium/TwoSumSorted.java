import java.util.Arrays;

public class TwoSumSorted {
    static int[] findPair(int[] a, int target) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) return new int[]{left + 1, right + 1};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        System.out.println(Arrays.toString(findPair(a, 9)));
    }
}
