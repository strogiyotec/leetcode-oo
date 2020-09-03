package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public final class NQueensTestCase {

    private NQueens alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NQueens();
    }

    @Test
    public void test() {
        final List<List<String>> boards = this.alg.solveNQueens(4);
        Assert.assertEquals(
                boards.get(0),
                Arrays.asList(
                        "..Q.",
                        "Q...",
                        "...Q",
                        ".Q.."
                )
        );
        Assert.assertEquals(
                boards.get(1),
                Arrays.asList(
                        ".Q..",
                        "...Q",
                        "Q...",
                        "..Q."
                )
        );
    }
}
