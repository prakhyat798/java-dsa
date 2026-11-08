import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    static int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[j - 1]) a[j++] = a[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 4, 4, 5};
        int size = removeDuplicates(a);
        System.out.println(Arrays.toString(Arrays.copyOf(a, size)));
    }
}
