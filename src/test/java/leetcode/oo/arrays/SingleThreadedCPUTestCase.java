package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SingleThreadedCPUTestCase {

    private SingleThreadedCPU alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SingleThreadedCPU();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{0, 2, 3, 1},
            this.alg.getOrder(
                new int[][]{
                    {1, 2}, {2, 4}, {3, 2}, {4, 1}
                }
            )
        );
        Assert.assertArrayEquals(
            new int[]{4, 3, 2, 0, 1},
            this.alg.getOrder(
                new int[][]{
                    {7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}
                }
            )
        );
    }
}
