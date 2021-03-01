package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class OddSumSubArrayTestCase {

    private OddSumSubArrays alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new OddSumSubArrays();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.numOfSubarrays(new int[]{1,3,5})
        );
    }

}
