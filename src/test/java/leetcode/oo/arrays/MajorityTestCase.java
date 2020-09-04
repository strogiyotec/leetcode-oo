package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MajorityTestCase {

    private Majority alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Majority();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.majorityElement(new int[]{3,2,3}),
                3
        );

    }
}
