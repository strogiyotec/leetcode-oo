package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxChunksTestCase {

    private MaxChunksMakeSorted alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MaxChunksMakeSorted();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            1,
            this.alg.maxChunksToSorted(
                new int[]{2,0,1}
            )
        );
        Assert.assertEquals(
            2,
            this.alg.maxChunksToSorted(
                new int[]{0,2,1}
            )
        );
    }
}
