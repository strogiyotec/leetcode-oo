package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinPathSumTestCase {

    private MinPathSum alg;

    @Before
    public void init() {
        this.alg = new MinPathSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.minPathSum(
                        new int[][]{
                                {1, 3, 1},
                                {1, 5, 1},
                                {4, 2, 1},
                        }
                ),
                7
        );
    }
}
