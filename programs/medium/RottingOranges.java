import java.util.*;

public class RottingOranges {
    static int minutesToRot(int[][] grid) {
        int rows = grid.length;
        if (rows == 0) return 0;
        int cols = grid[0].length, fresh = 0, minutes = 0;
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) q.add(new int[]{r, c});
                if (grid[r][c] == 1) fresh++;
            }
        }
        int[][] moves = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty() && fresh > 0) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                int[] cell = q.remove();
                for (int[] move : moves) {
                    int r = cell[0] + move[0], c = cell[1] + move[1];
                    if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] != 1) continue;
                    grid[r][c] = 2;
                    fresh--;
                    q.add(new int[]{r, c});
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(minutesToRot(grid));
    }
}
