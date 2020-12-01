package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SubArraySumTestCase {

    private SubArraySum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SubArraySum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            7L,
            (long) this.alg.subarraySum(
                new int[]{
                    5, 0, 5, 10, 3, 2, -15, 4
                },
                5
            )
        );
    }
}
