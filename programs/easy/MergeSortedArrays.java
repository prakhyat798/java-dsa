import java.util.Arrays;

public class MergeSortedArrays {
    static int[] merge(int[] a, int[] b) {
        int[] ans = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) ans[k++] = a[i++];
            else ans[k++] = b[j++];
        }
        while (i < a.length) ans[k++] = a[i++];
        while (j < b.length) ans[k++] = b[j++];
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 7}, b = {2, 3, 9};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
