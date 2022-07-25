package leetcode.oo.sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxConseqFloorsTestCase {

    private MaxConseqFloors alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxConseqFloors();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.maxConsecutive(
                2, 9,
                new int[]{4, 6}
            )
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
            4,
            this.alg.maxConsecutive(
                3, 15,
                new int[]{7, 9, 13}
            )
        );
    }
}
