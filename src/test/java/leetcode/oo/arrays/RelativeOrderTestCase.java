package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RelativeOrderTestCase {
    private RelativeOrder alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new RelativeOrder();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            this.alg.relativeSortArray(
                new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6}
            ),
            new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}
        );
    }
}
