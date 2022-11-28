package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FindKSumOfArrayTestCase {

    private FindKSumOfArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new FindKSumOfArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            this.alg.kSum(
                new int[]{2, 4, -2}, 5
            ),
            2
        );
    }
}
