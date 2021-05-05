package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BinarySubArrayWithSumTestCase {

    private BinarySubArrayWithSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BinarySubArrayWithSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.numSubarraysWithSum(
                new int[]{
                    1, 0, 1, 0, 1
                },
                2
            )
        );
    }
}
