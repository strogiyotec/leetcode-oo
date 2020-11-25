package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxProfitTestCase {

    private MaxProfitWorker alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxProfitWorker();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            324L,
            (long) this.alg.maxProfitAssignment(
                new int[]{68, 35, 52, 47, 86},
                new int[]{67, 17, 1, 81, 3},
                new int[]{92, 10, 85, 84, 82}
            )
        );
        Assert.assertEquals(
            100L,
            (long) this.alg.maxProfitAssignment(
                new int[]{2, 4, 6, 8, 10},
                new int[]{10, 20, 30, 40, 50},
                new int[]{4, 5, 6, 7}
            )
        );
        Assert.assertEquals(
            0L,
            (long) this.alg.maxProfitAssignment(
                new int[]{85, 47, 57},
                new int[]{24, 66, 99},
                new int[]{40, 25, 25}
            )
        );
    }
}
