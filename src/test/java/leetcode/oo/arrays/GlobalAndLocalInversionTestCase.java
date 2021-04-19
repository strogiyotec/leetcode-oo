package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class GlobalAndLocalInversionTestCase {

    private GlobalAndLocalInversions alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new GlobalAndLocalInversions();
    }

    @Test
    public void test(){
        Assert.assertFalse(this.alg.isIdealPermutation(new int[]{2,0,3,1}));
    }
}
