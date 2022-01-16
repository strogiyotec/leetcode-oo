package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FlowerPlantingTestCase {

    private FlowerPlanting alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new FlowerPlanting();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{1, 2, 3, 4},
            this.alg.gardenNoAdj(
                4,
                new int[][]{
                    {1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}, {2, 4}
                }
            )
        );
    }
}
