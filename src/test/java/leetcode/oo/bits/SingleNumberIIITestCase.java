package leetcode.oo.bits;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SingleNumberIIITestCase {

    private SingleNumberIII alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SingleNumberIII();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{5, 3},
            this.alg.singleNumber(
                new int[]{1, 2, 1, 3, 2, 5}
            )
        );
    }
}
