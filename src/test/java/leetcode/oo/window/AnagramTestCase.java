package leetcode.oo.window;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AnagramTestCase {

    private Anagrams alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Anagrams();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList(0,1,2),
            this.alg.findAnagrams("abab", "ab")
        );
        Assert.assertEquals(
            Arrays.asList(0,6),
            this.alg.findAnagrams("cbaebabacd", "abc")
        );
    }
}
