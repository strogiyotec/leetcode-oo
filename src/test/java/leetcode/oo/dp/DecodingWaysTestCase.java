package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DecodingWaysTestCase {

    private DecodingWays alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DecodingWays();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.numDecodings("012"),
                0
        );
        Assert.assertEquals(
                this.alg.numDecodings("10"),
                1
        );
        Assert.assertEquals(
                this.alg.numDecodings("01"),
                0
        );
        Assert.assertEquals(
                this.alg.numDecodings("00"),
                0
        );
        Assert.assertEquals(
                this.alg.numDecodings("226"),
                3
        );
    }
}
