package leetcode.oo.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CapacityToShipTestCase {

    private CapacityToShipPackages alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new CapacityToShipPackages();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            15,
            this.alg.shipWithinDays(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5
            )
        );
    }
}
