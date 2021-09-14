package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PartitionEqualSumTestCase {

    private PartitionEqualSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PartitionEqualSum();
    }

    @Test
    public void test() {
        Assert.assertFalse(
            this.alg.canPartitionKSubsets(
                new int[]{1,2,3,4},
                3
            )
        );
        Assert.assertTrue(
            this.alg.canPartitionKSubsets(
                new int[]{4, 3, 2, 3, 5, 2, 1}, 4
            )
        );
    }
}
