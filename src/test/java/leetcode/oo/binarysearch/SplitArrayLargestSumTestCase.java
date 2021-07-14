package leetcode.oo.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SplitArrayLargestSumTestCase {

    private SplitArrayLargestSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SplitArrayLargestSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            18,
            this.alg.splitArray(
                new int[]{7, 2, 5, 10, 8}, 2
            )
        );
    }
}
