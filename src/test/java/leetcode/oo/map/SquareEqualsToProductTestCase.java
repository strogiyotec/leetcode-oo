package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SquareEqualsToProductTestCase {

    private SquareEqualToProduct alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SquareEqualToProduct();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            1,
            this.alg.numTriplets(
                new int[]{7,4},
                new int[]{5,2,8,9}
            )
        );
        Assert.assertEquals(
            9,
            this.alg.numTriplets(
                new int[]{1,1,1},
                new int[]{1,1}
            )
        );
    }
}
