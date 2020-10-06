package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PalindromSubsTestCase {
    private PalindromeSubs alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PalindromeSubs();
    }

    @Test
    public void test(){
        Assert.assertEquals(3L, (long) this.alg.countSubstrings("aa"));
        Assert.assertEquals(6L, (long) this.alg.countSubstrings("aaa"));
        Assert.assertEquals(3L, (long) this.alg.countSubstrings("abc"));
    }
}
