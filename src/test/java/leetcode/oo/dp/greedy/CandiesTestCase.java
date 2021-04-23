package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CandiesTestCase {

    private Candies alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Candies();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            18,
            this.alg.candy(new int[]{1, 6, 10, 8, 7, 3, 2})
        );
        Assert.assertEquals(
            7,
            this.alg.candy(new int[]{1, 3, 2, 2, 1})
        );
        Assert.assertEquals(
            13,
            this.alg.candy(new int[]{1, 2, 87, 87, 87, 2, 1})
        );
    }
}
