package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinDeletionCostTestCase {

    private MinDeletionCost alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinDeletionCost();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            2,
            this.alg.minCost(
                "aabaa", new int[]{1, 2, 3, 4, 1}
            )
        );
    }
}
