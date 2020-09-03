package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * N queens.
 * See {@link <a href ="https://leetcode.com/problems/n-queens/">https://leetcode.com/problems/n-queens/</a>}
 */
final class NQueens {

    List<List<String>> solveNQueens(final int length) {
        final char[][] board = new char[length][length];
        for (final char[] line : board) {
            Arrays.fill(line, '.');
        }
        final List<List<String>> solution = new ArrayList<>();
        this.solve(board, solution, 0);
        return solution;
    }

    private void solve(final char[][] board, final List<List<String>> solution, final int column) {
        if (column == board.length) {
            solution.add(this.build(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (this.validate(board, i, column)) {
                board[i][column] = 'Q';
                this.solve(
                        board,
                        solution,
                        column + 1
                );
                board[i][column] = '.';
            }
        }
    }

    private boolean validate(final char[][] board, final int row, final int column) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == 'Q' && (row == i || Math.abs(row - i) == Math.abs(column - j))) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<String> build(final char[][] board) {
        final List<String> solution = new ArrayList<>(board.length + 1);
        for (final char[] chars : board) {
            solution.add(new String(chars));
        }
        return solution;
    }
}

