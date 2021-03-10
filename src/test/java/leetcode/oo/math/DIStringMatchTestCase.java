package leetcode.oo.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DIStringMatchTestCase {

    private DIStringMatch alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DIStringMatch();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{3,2,0,1},this.alg.diStringMatch("DDI"));
        Assert.assertArrayEquals(new int[]{0,4,1,3,2},this.alg.diStringMatch("IDID"));
    }
}
