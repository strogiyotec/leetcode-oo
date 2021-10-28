package leetcode.amazon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NextGreaterElementIITestCase {

    private NextGreaterElementII alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NextGreaterElementII();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{2,-1,2},
            this.alg.nextGreaterElements(
                new int[]{1, 2, 1}
            )
        );
    }
}
