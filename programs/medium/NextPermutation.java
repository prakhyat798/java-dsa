import java.util.Arrays;

public class NextPermutation {
    static void reverse(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left++] = a[right];
            a[right--] = temp;
        }
    }

    static void next(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i]) j--;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        reverse(a, i + 1, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2};
        next(a);
        System.out.println(Arrays.toString(a));
    }
}
