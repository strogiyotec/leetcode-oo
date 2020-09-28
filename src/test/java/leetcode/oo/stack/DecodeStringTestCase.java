package leetcode.oo.stack;

import leetcode.oo.stacks.DecodeString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DecodeStringTestCase {

    private DecodeString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DecodeString();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "aaabcbc",
            this.alg.decodeString("3[a]2[bc]")
        );
        Assert.assertEquals(
            "accaccacc",
            this.alg.decodeString("3[a2[c]]")
        );
        Assert.assertEquals(
            "abcabccdcdcdef",
            this.alg.decodeString("2[abc]3[cd]ef")
        );
    }
}
