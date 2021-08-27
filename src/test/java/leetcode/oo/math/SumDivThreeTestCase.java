package leetcode.oo.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SumDivThreeTestCase {

    private SumDivThree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SumDivThree();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            18,
            this.alg.maxSumDivThree(
                new int[]{
                    3, 6, 5, 1, 8
                }
            )
        );
    }
}
