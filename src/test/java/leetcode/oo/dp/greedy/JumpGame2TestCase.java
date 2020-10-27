package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class JumpGame2TestCase {

    private JumpGame2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new JumpGame2();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2L,
            (long) this.alg.jump(new int[]{2, 3, 1, 1, 4})
        );
        Assert.assertEquals(
            2L,
            (long) new JumpGame2().jump(new int[]{2, 3, 0, 1, 4})
        );
    }
}
