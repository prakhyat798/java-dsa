import java.util.Arrays;

public class MatrixTranspose {
    static int[][] transpose(int[][] a) {
        int rows = a.length, cols = a[0].length;
        int[][] t = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) t[j][i] = a[i][j];
        }
        return t;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        for (int[] row : transpose(a)) System.out.println(Arrays.toString(row));
    }
}
