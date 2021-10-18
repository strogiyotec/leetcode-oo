package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class IntegerToEngishTestCase {

    private IntegerToEnglish alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new IntegerToEnglish();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "One Hundred Twenty Three",
            this.alg.numberToWords(123)
        );
    }
}
