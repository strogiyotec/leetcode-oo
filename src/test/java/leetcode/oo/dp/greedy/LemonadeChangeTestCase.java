package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LemonadeChangeTestCase {

    private LemonadeChange alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LemonadeChange();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.lemonadeChange(
            new int[]{5, 5, 10, 10, 5, 20, 5, 10, 5, 5}
        ));
        Assert.assertTrue(this.alg.lemonadeChange(
            new int[]{5, 5, 5, 10, 5, 20, 5, 10, 5, 20}
        ));
        Assert.assertTrue(this.alg.lemonadeChange(
            new int[]{5, 5, 5, 5, 10, 5, 10, 10, 10, 20}
        ));
        Assert.assertFalse(this.alg.lemonadeChange(
            new int[]{5, 5, 10, 10, 20}
        ));
        Assert.assertFalse(this.alg.lemonadeChange(
            new int[]{10, 10}
        ));
        Assert.assertTrue(this.alg.lemonadeChange(
            new int[]{5, 5, 10}
        ));
        Assert.assertTrue(this.alg.lemonadeChange(
            new int[]{5, 5, 5, 10, 20}
        ));
    }
}
