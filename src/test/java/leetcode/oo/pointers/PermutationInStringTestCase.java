package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PermutationInStringTestCase {

    private PermutationString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PermutationString();
    }

    @Test
    public void test() {
        Assert.assertTrue(
            this.alg.checkInclusion(
                "abcdxabcde",
                "abcdeabcdx"
            )
        );
        Assert.assertFalse(
            this.alg.checkInclusion(
                "abc",
                "ccccbbbbaaaa"
            )
        );
        Assert.assertTrue(
            this.alg.checkInclusion(
                "ab",
                "eidbaooo"
            )
        );
    }
}
