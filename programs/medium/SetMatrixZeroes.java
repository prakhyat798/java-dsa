import java.util.Arrays;

public class SetMatrixZeroes {
    static void setZeroes(int[][] a) {
        if (a.length == 0 || a[0].length == 0) return;
        int rows = a.length, cols = a[0].length;
        boolean firstRowZero = false, firstColZero = false;

        for (int j = 0; j < cols; j++) if (a[0][j] == 0) firstRowZero = true;
        for (int i = 0; i < rows; i++) if (a[i][0] == 0) firstColZero = true;
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (a[i][j] == 0) {
                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (a[i][0] == 0 || a[0][j] == 0) a[i][j] = 0;
            }
        }
        if (firstRowZero) for (int j = 0; j < cols; j++) a[0][j] = 0;
        if (firstColZero) for (int i = 0; i < rows; i++) a[i][0] = 0;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(a);
        for (int[] row : a) System.out.println(Arrays.toString(row));
    }
}
