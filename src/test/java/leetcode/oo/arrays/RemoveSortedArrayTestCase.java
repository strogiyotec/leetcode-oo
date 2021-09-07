package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveSortedArrayTestCase {

    private RemoveSortedArray alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new RemoveSortedArray();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            4,
            this.alg.findLengthOfShortestSubarray(
                new int[]{5, 4, 3, 2, 1}
            )
        );
    }

    @Test
    public void test2(){
        Assert.assertEquals(
            0,
            this.alg.findLengthOfShortestSubarray(
                new int[]{1,2,3}
            )
        );
    }
}
