package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PartitionEqualSubsetTestCase {

    private PartitionEqualSubset alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PartitionEqualSubset();
    }

    @Test
    public void test() {
        Assert.assertTrue(
            this.alg.canPartition(new int[]{1, 5, 11, 5})
        );
        Assert.assertFalse(
            this.alg.canPartition(new int[]{1, 2, 3, 5})
        );
    }
}
