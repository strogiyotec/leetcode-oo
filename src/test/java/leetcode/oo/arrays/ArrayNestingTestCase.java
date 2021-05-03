package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ArrayNestingTestCase {

    private ArrayNesting alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ArrayNesting();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            4,
            this.alg.arrayNesting(
               new int[]{5, 4, 0, 3, 1, 6, 2}
            )
        );
    }
}
