package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FlipStringTestCase {

    private FlipString alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new FlipString();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            2,
            this.alg.minFlipsMonoIncr("00011000")
        );
        Assert.assertEquals(
            2,
            this.alg.minFlipsMonoIncr("010110")
        );
    }
}
