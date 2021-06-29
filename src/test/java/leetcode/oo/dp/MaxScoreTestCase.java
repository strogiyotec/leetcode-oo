package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxScoreTestCase {

    private MaxScore alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxScore();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            102,
            this.alg.maximumScore(
                new int[]{-5, -3, -3, -2, 7, 1},
                new int[]{-10, -5, 3, 4, 6}
            )
        );
        Assert.assertEquals(
            14,
            this.alg.maximumScore(
                new int[]{1, 2, 3},
                new int[]{3, 2, 1}
            )
        );
    }
}
