package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SmallerNumbersTestCase {

    private HowManySmallerNumbers alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new HowManySmallerNumbers();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{4, 0, 1, 1, 3},
            this.alg.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})
        );
    }
}
