import java.util.Arrays;

public class MatrixAddition {
    static int[][] add(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) ans[i][j] = a[i][j] + b[i][j];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        for (int[] row : add(a, b)) System.out.println(Arrays.toString(row));
    }
}
