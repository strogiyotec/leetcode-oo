package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinStringFlipsTestCase {

    private StringFlips alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StringFlips();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.minFlips(
                "111000"
            )
        );
        Assert.assertEquals(
            1,
            this.alg.minFlips("1110")
        );
    }
}
