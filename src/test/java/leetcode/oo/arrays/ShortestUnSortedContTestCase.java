package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ShortestUnSortedContTestCase {

    private ShortestUnSortedContArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ShortestUnSortedContArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5,
            this.alg.findUnsortedSubarray(
                new int[]{2, 6, 4, 8, 10, 9, 15}
            )
        );
        Assert.assertEquals(
            0,
            this.alg.findUnsortedSubarray(
                new int[]{1, 2, 3, 4}
            )
        );
    }
}
