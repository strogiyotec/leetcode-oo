package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxNumberOccurrenceSubstringTestCase {

    private MaxNumberOccurrenceSubstring alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxNumberOccurrenceSubstring();
    }

    @Test
    public void test() {
        Assert.assertEquals(0, this.alg.maxFreq("abcde", 2, 3, 3));
        Assert.assertEquals(3, this.alg.maxFreq("aabcabcab", 2, 2, 3));
        Assert.assertEquals(2, this.alg.maxFreq("aaaa", 1, 3, 3));
        Assert.assertEquals(2, this.alg.maxFreq("aababcaab", 2, 3, 4));
    }
}
