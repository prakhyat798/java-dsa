public class ValidSudoku {
    static boolean isValid(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue;
                int digit = ch - '1';
                if (digit < 0 || digit > 8) return false;
                int b = (r / 3) * 3 + c / 3;
                if (row[r][digit] || col[c][digit] || box[b][digit])
                    return false;
                row[r][digit] = true;
                col[c][digit] = true;
                box[b][digit] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
            "53..7....".toCharArray(), "6..195...".toCharArray(),
            ".98....6.".toCharArray(), "8...6...3".toCharArray(),
            "4..8.3..1".toCharArray(), "7...2...6".toCharArray(),
            ".6....28.".toCharArray(), "...419..5".toCharArray(),
            "....8..79".toCharArray()
        };
        System.out.println(isValid(board));
    }
}
