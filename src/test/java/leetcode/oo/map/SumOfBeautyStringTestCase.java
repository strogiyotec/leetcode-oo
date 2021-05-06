package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SumOfBeautyStringTestCase {

    private SumOfBeautyOfAllStrings alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SumOfBeautyOfAllStrings();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            5,
            this.alg.beautySum("aabcb")
        );
    }
}
