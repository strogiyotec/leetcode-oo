package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LargestSubstringTestCase {

    private LargestSubstring alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LargestSubstring();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            4,
            this.alg.maxLengthBetweenEqualCharacters("cabbac")
        );
    }
}
