package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class OrangesTestCase {

    private RottingOranges alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RottingOranges();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.orangesRotting(
                        new int[][]{
                                {2, 1, 1},
                                {1, 1, 0},
                                {0, 1, 1}
                        }
                ),
                4
        );
        Assert.assertEquals(
                this.alg.orangesRotting(
                        new int[][]{
                                {2, 1, 1},
                                {0, 1, 1},
                                {1, 0, 1}
                        }
                ),
                -1
        );
    }
}
