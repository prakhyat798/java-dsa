import java.util.*;

public class ShortestPathBinaryMatrix {
    static int shortest(int[][] grid) {
        int n = grid.length;
        if (n == 0 || grid[0].length != n) return -1;
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) return -1;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1},
                        {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        boolean[][] seen = new boolean[n][n];
        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0, 1});
        seen[0][0] = true;
        while (!q.isEmpty()) {
            int[] curr = q.remove();
            int r = curr[0], c = curr[1], distance = curr[2];
            if (r == n - 1 && c == n - 1) return distance;
            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                if (grid[nr][nc] == 1 || seen[nr][nc]) continue;
                seen[nr][nc] = true;
                q.add(new int[]{nr, nc, distance + 1});
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(shortest(new int[][]{{0, 1}, {1, 0}}));
    }
}
