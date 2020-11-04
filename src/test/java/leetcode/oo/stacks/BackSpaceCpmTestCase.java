package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class BackSpaceCpmTestCase {

    private BackSpaceStrCompare alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new BackSpaceStrCompare();
    }

    @Test
    public void test() {
        Assert.assertFalse(
            this.alg.backspaceCompare(
                "abcd",
                "bbcd"
            )
        );
        Assert.assertTrue(
            this.alg.backspaceCompare(
                "ab#c",
                "ad#c"
            )
        );
    }
}
