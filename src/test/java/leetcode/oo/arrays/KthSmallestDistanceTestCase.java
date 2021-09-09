package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KthSmallestDistanceTestCase {

    private KthSmallest alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new KthSmallest();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            0,
            this.alg.smallestDistancePair(
                new int[]{1,1,1},2
            )
        );
    }
}
