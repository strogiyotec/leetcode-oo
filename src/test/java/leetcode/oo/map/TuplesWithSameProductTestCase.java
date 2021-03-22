package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TuplesWithSameProductTestCase {

    private TuplesWithSameProduct alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new TuplesWithSameProduct();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            8,
            this.alg.tupleSameProduct(new int[]{2, 3, 4, 6})
        );
    }
}
