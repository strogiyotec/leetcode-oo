package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ArrayPartition1TestCase {

    private ArrayPartition1 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ArrayPartition1();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4L,
            (long) this.alg.arrayPairSum(
                new int[]{1, 4, 3, 2}
            )
        );
        Assert.assertEquals(
            9L,
            (long) this.alg.arrayPairSum(
                new int[]{6, 2, 6, 5, 1, 2}
            )
        );
    }
}
