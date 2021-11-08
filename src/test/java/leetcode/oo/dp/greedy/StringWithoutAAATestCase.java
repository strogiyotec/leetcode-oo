package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StringWithoutAAATestCase {

    private StringWithoutAAA alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StringWithoutAAA();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "aabaa",
            this.alg.strWithout3a3b(
                4, 1
            )
        );
    }
}
