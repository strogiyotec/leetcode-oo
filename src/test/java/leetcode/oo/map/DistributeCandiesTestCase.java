package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DistributeCandiesTestCase {

    private DistributeCandies alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DistributeCandies();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.distributeCandies(new int[]{1,1,2,2,3,3})
        );
    }
}
