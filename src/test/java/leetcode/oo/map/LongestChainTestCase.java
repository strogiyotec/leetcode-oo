package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LongestChainTestCase {

    private LongestStringChain alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LongestStringChain();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            4,
            this.alg.longestStrChain(
                new String[]{
                    "a", "b", "ba", "bca", "bda", "bdca"
                }
            )
        );
    }
}
