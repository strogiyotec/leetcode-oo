package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinOperationReduceTestCase {

    private MinOperationsX alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinOperationsX();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            -1L,
            (long) this.alg.minOperations(
                new int[]{1, 1},
                3
            )
        );
        Assert.assertEquals(
            1L,
            (long) this.alg.minOperations(
                new int[]{5, 2, 3, 1, 1},
                5
            )
        );
        Assert.assertEquals(
            5L,
            (long) this.alg.minOperations(
                new int[]{3, 2, 20, 1, 1, 3},
                10
            )
        );
        Assert.assertEquals(
            2L,
            (long) this.alg.minOperations(
                new int[]{1, 1, 4, 2, 3},
                5
            )
        );
    }
}
