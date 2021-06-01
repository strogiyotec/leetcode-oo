package leetcode.oo.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinSwapArrangeGridTestCase {

    private MinSwapArrangeGrid alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinSwapArrangeGrid();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            -1,
            this.alg.minSwaps(
                new int[][]{
                    {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}
                }
            )
        );
        Assert.assertEquals(
            3,
            this.alg.minSwaps(
                new int[][]{
                    {0, 0, 1}, {1, 1, 0}, {1, 0, 0}
                }
            )
        );
    }
}
