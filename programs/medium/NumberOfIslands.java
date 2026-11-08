public class NumberOfIslands {
    static void visit(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return;
        if (grid[i][j] != '1') return;

        grid[i][j] = '0';
        visit(grid, i + 1, j);
        visit(grid, i - 1, j);
        visit(grid, i, j + 1);
        visit(grid, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0'},
            {'1', '0', '0', '1'},
            {'0', '0', '1', '1'},
            {'0', '0', '0', '0'}
        };

        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    visit(grid, i, j);
                }
            }
        }

        System.out.println("Islands = " + islands);
    }
}
