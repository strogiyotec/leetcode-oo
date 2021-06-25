package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinJumpHomeTestCase {

    private MinJumpReachHome alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinJumpReachHome();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            -1,
            this.alg.minimumJumps(
                new int[]{8, 3, 16, 6, 12, 20},
                15,
                13,
                11
            )
        );
        Assert.assertEquals(
            3,
            this.alg.minimumJumps(
                new int[]{14, 4, 18, 1, 15},
                3,
                15,
                9
            )
        );
        Assert.assertEquals(
            2,
            this.alg.minimumJumps(
                new int[]{1, 6, 2, 14, 5, 17, 4},
                16,
                9,
                7
            )
        );
    }
}
