import java.util.Arrays;

public class MergeSortedArrays {
    // a has space for all elements from b at the end.
    static void merge(int[] a, int m, int[] b, int n) {
        int i = m - 1, j = n - 1, end = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && a[i] > b[j]) a[end--] = a[i--];
            else a[end--] = b[j--];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        merge(a, 3, b, 3);
        System.out.println(Arrays.toString(a));
    }
}
