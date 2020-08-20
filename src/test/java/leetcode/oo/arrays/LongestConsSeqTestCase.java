package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestConsSeqTestCase {

    private LongestConsSeq alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LongestConsSeq();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}),
                4
        );
        Assert.assertEquals(
                this.alg.longestConsecutive(new int[]{36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}),
                5
        );
        Assert.assertEquals(
                this.alg.longestConsecutive(new int[]{36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}),
                5
        );
    }
}
