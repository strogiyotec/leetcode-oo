package leetcode.oo.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberAtMostNTestCase {

    private NumbersAtMostN alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumbersAtMostN();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            29523,
            this.alg.atMostNGivenDigitSet(
                new String[]{"1", "4", "9"},
                1000000000
            )
        );
        Assert.assertEquals(
            20,
            this.alg.atMostNGivenDigitSet(
                new String[]{"1", "3", "5", "7"},
                100
            )
        );
    }
}
