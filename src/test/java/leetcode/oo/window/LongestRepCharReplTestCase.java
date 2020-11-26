package leetcode.oo.window;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestRepCharReplTestCase {

    private LongestRepCharRepl alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestRepCharRepl();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3L,
            (long) this.alg.characterReplacement("AAAB", 0)
        );
        Assert.assertEquals(
            4L,
            (long) this.alg.characterReplacement("ABAB", 2)
        );
    }
}
