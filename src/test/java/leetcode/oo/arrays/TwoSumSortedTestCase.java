package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TwoSumSortedTestCase {
    private TwoSumSorted alg;

    @Before
    public void init() {
        this.alg = new TwoSumSorted();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.twoSum(new int[]{2, 7, 11, 15}, 9),
                new int[]{1, 2}
        );
    }
}
