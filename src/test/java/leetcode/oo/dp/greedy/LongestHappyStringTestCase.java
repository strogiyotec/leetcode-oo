package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestHappyStringTestCase {

    private LongestHappyString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestHappyString();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "cc",
            this.alg.longestDiverseString(
                0, 0, 7
            )
        );
        Assert.assertEquals(
            "ccbccbccbbccbbccbbc",
            this.alg.longestDiverseString(
                0, 8, 11
            )
        );
        Assert.assertEquals(
            "ccbbccbbac",
            this.alg.longestDiverseString(
                1, 4, 5
            )
        );
        Assert.assertEquals(
            "aabaa",
            this.alg.longestDiverseString(
                7, 1, 0
            )
        );
        Assert.assertEquals(
            "ccaccbcc",
            this.alg.longestDiverseString(
                1, 1, 7
            )
        );
    }
}
