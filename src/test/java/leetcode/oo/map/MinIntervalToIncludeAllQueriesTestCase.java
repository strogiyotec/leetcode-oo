package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinIntervalToIncludeAllQueriesTestCase {

    private MinIntervalToIncludeAllQueries alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinIntervalToIncludeAllQueries();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{2, -1, 4, 6},
            this.alg.minInterval(
                new int[][]{
                    {2, 3}, {2, 5}, {1, 8}, {20, 25}
                },
                new int[]{2, 19, 5, 22}
            )
        );
        Assert.assertArrayEquals(
            new int[]{3, 3, 1, 4},
            this.alg.minInterval(
                new int[][]{
                    {1, 4}, {2, 4}, {3, 6}, {4, 4}
                },
                new int[]{2, 3, 4, 5}
            )
        );
    }
}
