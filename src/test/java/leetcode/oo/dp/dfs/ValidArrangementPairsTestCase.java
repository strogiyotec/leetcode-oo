package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ValidArrangementPairsTestCase {

    private ValidArrangementPairs alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ValidArrangementPairs();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[][]{
                {11, 9}, {9, 4}, {4, 5}, {5, 1}
            },
            this.alg.validArrangement(
                new int[][]{
                    {5, 1}, {4, 5}, {11, 9}, {9, 4}
                }
            )
        );
        Assert.assertArrayEquals(
            new int[][]{
                {1, 3}, {3, 2}, {2, 1}
            },
            this.alg.validArrangement(
                new int[][]{
                    {1, 3}, {3, 2}, {2, 1}
                }
            )
        );
    }
}
