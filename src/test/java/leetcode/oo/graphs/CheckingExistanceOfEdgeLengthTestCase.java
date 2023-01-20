package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CheckingExistanceOfEdgeLengthTestCase {

    private CheckingExistenseOfEdgeLength alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CheckingExistenseOfEdgeLength();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new boolean[]{true, false},
            this.alg.distanceLimitedPathsExist(
                5,
                new int[][]{
                    {0, 1, 10}, {1, 2, 5}, {2, 3, 9}, {3, 4, 13}
                },
                new int[][]{
                    {0, 4, 14}, {1, 4, 13}
                }
            )
        );
    }
}
