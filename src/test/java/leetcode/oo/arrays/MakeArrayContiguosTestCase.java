package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MakeArrayContiguosTestCase {

    private MakeArrayContiguous alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MakeArrayContiguous();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1,
            this.alg.minOperations(
                new int[]{1, 2, 3, 5, 6}
            )
        );
    }
}
