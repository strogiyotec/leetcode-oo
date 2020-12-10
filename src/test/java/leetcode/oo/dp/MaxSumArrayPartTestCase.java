package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxSumArrayPartTestCase {

    private MaxSumArrayPartition alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxSumArrayPartition();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            63L,
            (long) this.alg.maxSumAfterPartitioning(
                new int[]{
                    1, 15, 7, 9, 2
                },
                3
            )
        );
    }

}
