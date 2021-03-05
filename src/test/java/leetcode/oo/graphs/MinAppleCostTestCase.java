package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinAppleCostTestCase {

    private MinCostApples alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinCostApples();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            8,
            this.alg.minTime(
                7,
                new int[][]{
                    {0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}
                },
                Arrays.asList(false, false, true, false, true, true, false)
            )
        );
    }
}
