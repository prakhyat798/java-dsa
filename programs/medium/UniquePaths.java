import java.util.Arrays;

public class UniquePaths {
    static long countPaths(int rows, int cols) {
        if (rows < 1 || cols < 1) return 0;
        long[] dp = new long[cols];
        Arrays.fill(dp, 1L);
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) dp[c] += dp[c - 1];
        }
        return dp[cols - 1];
    }

    public static void main(String[] args) {
        System.out.println(countPaths(3, 7));
    }
}
