package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TwoSumTestCase {

    private TwoSum agl;

    @Before
    public void init() {
        this.agl = new TwoSum();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.agl.twoSum(new int[]{2, 7, 11, 15}, 9),
                new int[]{0, 1}
        );
        Assert.assertArrayEquals(
                this.agl.twoSum(new int[]{0, 4, 3, 0}, 0),
                new int[]{0, 3}
        );
        Assert.assertArrayEquals(
                this.agl.twoSum(new int[]{-1, -2, -3, -4, -5}, -8),
                new int[]{2, 4}
        );
        Assert.assertArrayEquals(
                this.agl.twoSum(new int[]{3, 2, 4}, 6),
                new int[]{1, 2}
        );
    }
}
