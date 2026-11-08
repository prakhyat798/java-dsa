import java.util.Arrays;

public class SortColors {
    static void sort(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low++] = a[mid];
                a[mid++] = temp;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 0, 2, 1, 1, 0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
