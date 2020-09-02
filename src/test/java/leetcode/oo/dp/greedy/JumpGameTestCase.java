package leetcode.oo.dp.greedy;

import leetcode.oo.dp.JumpGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class JumpGameTestCase {

    private JumpGame alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new JumpGame();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.canJump(
                new int[]{0}
        ));
        Assert.assertTrue(this.alg.canJump(
                new int[]{2, 0, 0}
        ));
        Assert.assertTrue(this.alg.canJump(
                new int[]{2, 3, 1, 1, 4}
        ));
        Assert.assertTrue(this.alg.canJump(
                new int[]{1, 2, 3}
        ));
        Assert.assertFalse(this.alg.canJump(
                new int[]{3, 2, 1, 0, 4}
        ));
        Assert.assertTrue(this.alg.canJump(
                new int[]{3, 0, 8, 2, 0, 0, 1}
        ));
    }
}
