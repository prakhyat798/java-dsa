import java.util.Arrays;

public class RotateMatrix90 {
    static void rotate(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int[] row : a) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = row[left];
                row[left++] = row[right];
                row[right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(a);
        for (int[] row : a) System.out.println(Arrays.toString(row));
    }
}
