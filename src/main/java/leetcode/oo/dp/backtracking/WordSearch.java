package leetcode.oo.dp.backtracking;

/**
 * Word Search.
 * See {@link <a href ="https://leetcode.com/problems/word-search/">https://leetcode.com/problems/word-search/</a>}
 */
final class WordSearch {

    boolean exist(final char[][] board, final String word) {
        final boolean[][] backtrack = new boolean[board.length][board[0].length];
        final Dfs dfs = new Dfs() {
            @Override
            public boolean found(final int i, final int j, final int position) {
                if (position == word.length()) {
                    return true;
                }
                if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(position) || backtrack[i][j]) {
                    return false;
                }
                backtrack[i][j] = true;
                if (
                        found(i, j - 1, position + 1)
                                || found(i, j + 1, position + 1)
                                || found(i - 1, j, position + 1)
                                || found(i + 1, j, position + 1)
                ) {
                    return true;
                }
                backtrack[i][j] = false;
                return false;
            }
        };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    if (dfs.found(i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    interface Dfs {
        boolean found(int i, int j, int position);
    }
}
