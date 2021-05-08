package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CarPoolingTestCase {

    private CarPooling alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CarPooling();
    }

    @Test
    public void test() {
        Assert.assertTrue(
            this.alg.carPooling(
                new int[][]{
                    {3, 2, 8}, {4, 4, 6}, {10, 8, 9}
                },
                11
            )
        );
        Assert.assertTrue(
            this.alg.carPooling(
                new int[][]{
                    {9, 3, 4}, {9, 1, 7}, {4, 2, 4}, {7, 4, 5}
                },
                23
            )
        );
        Assert.assertTrue(
            this.alg.carPooling(
                new int[][]{
                    {3, 2, 7}, {3, 7, 9}, {8, 3, 9}
                },
                11
            )
        );
    }
}
