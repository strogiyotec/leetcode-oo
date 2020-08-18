package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WordSearchTestCase {

    private WordSearch wordSearch;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.wordSearch = new WordSearch();
    }

    @Test
    public void test() {
        final char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        Assert.assertTrue(
                this.wordSearch.exist(board, "ABCCE")
        );
        Assert.assertTrue(
                this.wordSearch.exist(board, "SEE")
        );
        Assert.assertFalse(
                this.wordSearch.exist(board, "ABCB")
        );
    }
}
