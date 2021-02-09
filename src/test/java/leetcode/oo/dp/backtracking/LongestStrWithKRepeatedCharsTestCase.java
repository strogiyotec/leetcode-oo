package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestStrWithKRepeatedCharsTestCase {

    private LongestStrWithKRepeatedChars alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg =new LongestStrWithKRepeatedChars();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            5,
            this.alg.longestSubstring("ababbc",2)
        );
    }
}
