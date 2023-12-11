package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveKDigitsTestCase {

    private RemoveKDigits alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RemoveKDigits();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "1219",
            this.alg.removeKdigits("1432219", 3)
        );
    }
}
