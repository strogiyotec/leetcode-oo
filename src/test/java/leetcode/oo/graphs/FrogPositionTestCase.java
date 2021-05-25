package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FrogPositionTestCase {

    private FrogPosition alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new FrogPosition();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            0.1666,
            this.alg.frogPosition(
                7,
                new int[][]{
                    {1, 2}, {1, 3}, {1, 7}, {2, 4}, {2, 6}, {3, 5}
                },
                20,
                6
            ),
            100
        );
        Assert.assertEquals(
            0.0,
            this.alg.frogPosition(
                8,
                new int[][]{
                    {2, 1}, {3, 2}, {4, 1}, {5, 1}, {6, 4}, {7, 1}, {8, 7}
                },
                7,
                7
            ),
            100
        );
    }
}
