package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestSubOfAllVowelsTestCase {

    private LongestSubstringOfAllVowels alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LongestSubstringOfAllVowels();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            13,
            this.alg.longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu")
        );
    }
}
