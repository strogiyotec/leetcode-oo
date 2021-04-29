package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ListIntersectionTestCase {

    private ListIntersection alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ListIntersection();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[][]{
                {4, 5},
                {9, 10},
                {11, 12},
                {14, 15},
                {16, 20}
            },
            this.alg.intervalIntersection(
                new int[][]{
                    {3, 5}, {9, 20}
                },
                new int[][]{
                    {4, 5}, {7, 10}, {11, 12}, {14, 15}, {16, 20}
                }
            )
        );
    }
}
