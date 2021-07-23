package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Test;

public final class KthLargestTestCase {

    @Test
    public void test() {
        final KthLargest largest = new KthLargest(3, new int[]{4, 5, 8, 2});
        Assert.assertEquals(
            4,
            largest.add(3)
        );
        Assert.assertEquals(
            5,
            largest.add(5)
        );
        Assert.assertEquals(
            5,
            largest.add(10)
        );
        Assert.assertEquals(
            8,
            largest.add(9)
        );
        Assert.assertEquals(
            8,
            largest.add(4)
        );
    }
}
