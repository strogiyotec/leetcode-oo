package leetcode.oo.stack;

import leetcode.oo.stacks.RemoveDuplicateLetters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveDuplicateLettersTestCase {

    private RemoveDuplicateLetters alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RemoveDuplicateLetters();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "acdb",
            this.alg.removeDuplicateLetters("cbacdcbc")
        );
    }
}
