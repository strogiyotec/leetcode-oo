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
    public void test3() {
        Assert.assertArrayEquals(
            new int[]{2, 3, 4, -1, 4},
            this.alg.nextGreaterElements(
                new int[]{1, 2, 3, 4, 3}
            )
        );
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(
            new int[]{2, 3, -1, 3, 2},
            this.alg.nextGreaterElements(
                new int[]{1, 2, 3, 2, 1}
            )
        );
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{2, -1, 2},
            this.alg.nextGreaterElements(
                new int[]{1, 2, 1}
            )
        );
    }
}
