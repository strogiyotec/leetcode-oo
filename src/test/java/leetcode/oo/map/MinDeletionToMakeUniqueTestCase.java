package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinDeletionToMakeUniqueTestCase {

    private MinDeletionToMakeUnique alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MinDeletionToMakeUnique();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            2,
            this.alg.minDeletions("aaabbbcc")
        );
    }
}
