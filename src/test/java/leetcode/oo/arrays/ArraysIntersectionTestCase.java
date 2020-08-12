package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ArraysIntersectionTestCase {

    private ArraysIntersection alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ArraysIntersection();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.intersection(
                        new int[]{4, 9, 5},
                        new int[]{9, 4, 9, 8, 4}
                ),
                new int[]{4, 9}
        );
    }
}
