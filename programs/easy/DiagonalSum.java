public class DiagonalSum {
    static int sumBothDiagonals(int[][] a) {
        int n = a.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
            if (i != n - i - 1) sum += a[i][n - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumBothDiagonals(a));
    }
}
