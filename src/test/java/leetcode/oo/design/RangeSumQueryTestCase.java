package leetcode.oo.design;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RangeSumQueryTestCase {

    private NumArray alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new NumArray(new int[]{1,3,5});
    }

    @Test
    public void test(){
        Assert.assertEquals(
            9,
            this.alg.sumRange(0,2)
        );
        this.alg.update(1,2);
        Assert.assertEquals(
            8,
            this.alg.sumRange(0,2)

        );
    }
}
