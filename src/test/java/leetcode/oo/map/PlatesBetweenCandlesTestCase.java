package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PlatesBetweenCandlesTestCase {

    private PlatesBetweenCandles alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PlatesBetweenCandles();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{2},
            this.alg.platesBetweenCandles(
                "||**||**|*",
                new int[][]{
                    {3, 8}
                }
            )
        );
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(
            new int[]{2,3},
            this.alg.platesBetweenCandles(
                "**|**|***|",
                new int[][]{
                    {2,5},
                    {5,9}
                }
            )
        );
    }
}
