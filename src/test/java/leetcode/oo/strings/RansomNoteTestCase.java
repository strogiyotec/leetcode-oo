package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RansomNoteTestCase {

    private RansomNote alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RansomNote();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.canConstruct("aab", "baa"));
        Assert.assertFalse(this.alg.canConstruct("aa", "ab"));
        Assert.assertTrue(this.alg.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}
