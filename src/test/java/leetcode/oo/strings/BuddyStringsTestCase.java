package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BuddyStringsTestCase {

    private BuddyStrings alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new BuddyStrings();
    }

    @Test
    public void test(){
        Assert.assertTrue(
            this.alg.buddyStrings("aa","aa")
        );
        Assert.assertFalse(
            this.alg.buddyStrings("ab","ab")
        );
        Assert.assertTrue(
            this.alg.buddyStrings("ab","ba")
        );
    }
}
