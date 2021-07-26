package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DesertCostTestCase {

    private DesertCost alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DesertCost();
    }


    @Test
    public void test(){
        Assert.assertEquals(
            17,
            this.alg.closestCost(
                new int[]{2,3},
                new int[]{4,5,100},
                18
            )
        );
        Assert.assertEquals(
            9,
            this.alg.closestCost(
                new int[]{1},
                new int[]{8, 10},
                10
            )
        );
    }

}
