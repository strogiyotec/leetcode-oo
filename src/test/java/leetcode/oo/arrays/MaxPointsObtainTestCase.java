package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxPointsObtainTestCase {

    private MaxPointsObtain alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MaxPointsObtain();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            202,
            this.alg.maxScore(
                new int[]{1,79,80,1,1,1,200,1},
                3
            )
        );
    }
}
