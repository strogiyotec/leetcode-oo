package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Word Search2.
 * See {@link <a href ="https://leetcode.com/problems/word-search-ii/">https://leetcode.com/problems/word-search-ii/</a>}
 */
final class WordSearch2 {

    List<String> findWords(final char[][] board, final String[] words) {
        final List<String> list = new ArrayList<>(words.length + 1);
        final Search search = new Search() {
            @Override
            public boolean findWord(final String word, final int i, final int j, int position, final boolean[][] dp) {
                if (position == word.length()) {
                    return true;
                }
                if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(position) || dp[i][j]) {
                    return false;
                }
                dp[i][j] = true;
                if (
                        findWord(word, i, j - 1, position + 1, dp)
                                || findWord(word, i, j + 1, position + 1, dp)
                                || findWord(word, i - 1, j, position + 1, dp)
                                || findWord(word, i + 1, j, position + 1, dp)
                ) {
                    return true;
                }
                dp[i][j] = false;
                return false;
            }
        };
        for (final String word : words) {
            start:
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        if (search.findWord(word, i, j, 0, new boolean[board.length][board[0].length])) {
                            list.add(word);
                            break start;
                        }
                    }
                }
            }
        }
        return list;
    }

    interface Search {
        boolean findWord(String word, int i, int j, int position, boolean[][] dp);
    }
}
