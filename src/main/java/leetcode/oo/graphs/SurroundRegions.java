package leetcode.oo.graphs;


/**
 * Surrounded Regions.
 * See {@link <a href ="https://leetcode.com/problems/surrounded-regions/">https://leetcode.com/problems/surrounded-regions/</a>}
 */
final class SurroundRegions {

    void solve(final char[][] board) {
        if (board.length == 0) {
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O') this.surround(board, i, 0);
            if (board[i][board[0].length - 1] == 'O') this.surround(board, i, board[0].length - 1);
        }
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O') this.surround(board, 0, j);
            if (board[board.length - 1][j] == 'O') this.surround(board, board.length - 1, j);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void surround(final char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '*';
        this.surround(board, i + 1, j);
        this.surround(board, i - 1, j);
        this.surround(board, i, j + 1);
        this.surround(board, i, j - 1);
    }
}
