package leetcode.oo.window;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxConsOnes3TestCase {

    private MaxConsOnes3 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxConsOnes3();
    }

    @Test
    public void test() {
        Assert.assertEquals(6L,
            (long) this.alg.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2)
        );
    }
}
