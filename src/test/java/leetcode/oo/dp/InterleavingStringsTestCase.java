package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class InterleavingStringsTestCase {

    private InterleavingStrings alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new InterleavingStrings();
    }

    @Test
    public void test() {
        Assert.assertTrue(
            this.alg.isInterleave(
                "aabc",
                "abad",
                "aabadabc"
            )
        );
    }
}
