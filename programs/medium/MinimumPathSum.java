public class MinimumPathSum {
    // Move only right or down.
    static int minimum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        int rows = grid.length, cols = grid[0].length;
        int[] dp = new int[cols];
        dp[0] = grid[0][0];
        for (int c = 1; c < cols; c++) dp[c] = dp[c - 1] + grid[0][c];
        for (int r = 1; r < rows; r++) {
            dp[0] += grid[r][0];
            for (int c = 1; c < cols; c++) {
                dp[c] = Math.min(dp[c], dp[c - 1]) + grid[r][c];
            }
        }
        return dp[cols - 1];
    }

    public static void main(String[] args) {
        System.out.println(minimum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
}
