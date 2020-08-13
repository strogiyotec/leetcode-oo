package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DetectCapitalTestCase {

    private DetectCapital alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DetectCapital();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.detectCapitalUse("USA"));
        Assert.assertFalse(this.alg.detectCapitalUse("FlaG"));
    }
}
