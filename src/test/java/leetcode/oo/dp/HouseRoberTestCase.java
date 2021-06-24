package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class HouseRoberTestCase {
    private HouseRobber alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new HouseRobber();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            this.alg.rob(new int[]{2, 1, 1, 2}),
            4
        );
        Assert.assertEquals(
            this.alg.rob(new int[]{2, 1}),
            2
        );
        Assert.assertEquals(
            this.alg.rob(new int[]{1, 3, 1}),
            3
        );
        Assert.assertEquals(
            this.alg.rob(new int[]{2, 7, 9, 3, 1}),
            12
        );
        Assert.assertEquals(
            this.alg.rob(new int[]{1, 2, 3, 1}),
            4
        );
    }
}
