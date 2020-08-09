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
        Assert.assertEquals(this.alg.climbStairs(4),5);
        Assert.assertEquals(this.alg.climbStairs(3),3);
        Assert.assertEquals(this.alg.climbStairs(2),2);
    }
}
