package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ThreeConsecutiveOddsTestCase {

    private ThreeConsecutiveOdds alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ThreeConsecutiveOdds();
    }

    @Test
    public void test(){
        Assert.assertTrue(this.alg.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }
}
