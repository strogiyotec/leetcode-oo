package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DivideArrayIntoKSeqTestCase {

    private DivideArrayIntoKSequences alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DivideArrayIntoKSequences();
    }

    @Test
    public void test(){
        Assert.assertTrue(
            this.alg.isPossibleDivide(
                new int[]{1, 2, 3, 3, 4, 4, 5, 6}, 4
            )
        );
    }
}
