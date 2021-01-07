package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ClimbStairsTestCase {
    private ClimbStairs alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ClimbStairs();
    }

    @Test
    public void test(){
        Assert.assertEquals(5L, (long) this.alg.climbStairs(4));
        Assert.assertEquals(3L, (long) this.alg.climbStairs(3));
        Assert.assertEquals(2L, (long) this.alg.climbStairs(2));
    }
}
