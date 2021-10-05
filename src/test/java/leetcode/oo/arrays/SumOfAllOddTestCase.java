package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SumOfAllOddTestCase {

    private SumOfAllOdd alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SumOfAllOdd();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            58,
            this.alg.sumOddLengthSubarrays(
                new int[]{1, 4, 2, 5, 3}
            )
        );
    }
}
