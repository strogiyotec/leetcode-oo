package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PartitionArrayThreePartsTestCase {

    private PartitionArrayInThreeParts alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PartitionArrayInThreeParts();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.canThreePartsEqualSum(
            new int[]{0,2,1,-6,6,-7,9,1,2,0,1}
        ));
        Assert.assertTrue(this.alg.canThreePartsEqualSum(
            new int[]{0, 0, 0, 0}
        ));
    }

}
