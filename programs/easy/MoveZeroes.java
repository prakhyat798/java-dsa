import java.util.Arrays;

public class MoveZeroes {
    static void move(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 5, 0, 3, 2, 0, 8};
        move(a);
        System.out.println(Arrays.toString(a));
    }
}
