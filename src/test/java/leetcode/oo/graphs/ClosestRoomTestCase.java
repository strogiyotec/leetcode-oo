package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ClosestRoomTestCase {

    private ClosestRoom alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ClosestRoom();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{3, -1, 3},
            this.alg.closestRoom(
                new int[][]{
                    {2, 2}, {1, 2}, {3, 2}
                },
                new int[][]{
                    {3, 1}, {3, 3}, {5, 2}
                }
            )
        );
    }
}
