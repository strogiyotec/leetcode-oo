package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DominoRotationsTestCase {

    private DominoRotations alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DominoRotations();
    }

    @Test
    public void test() {

        Assert.assertEquals(
            -1L,
            (long) this.alg.minDominoRotations(
                new int[]{3, 5, 1, 2, 3},
                new int[]{3, 6, 3, 3, 4}
            )
        );
        Assert.assertEquals(
            2L,
            (long) this.alg.minDominoRotations(
                new int[]{2, 1, 2, 4, 2, 2},
                new int[]{5, 2, 6, 2, 3, 2}
            )
        );
    }
}
