package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CoinChange2TestCase {

    private CoinChange2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CoinChange2();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4L,
            (long) this.alg.change(
                5,
                new int[]{1, 2, 5}
            )
        );
        Assert.assertEquals(
            35502874L,
            (long) this.alg.change(
                500,
                new int[]{3, 5, 7, 8, 9, 10, 11}
            )
        );
    }
}
