package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountSubstringDifferByOneCharTestCase {

    private CountSubstringDifferByOneChar alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountSubstringDifferByOneChar();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.countSubstrings(
                "ab",
                "bb"
            )
        );
    }
}
