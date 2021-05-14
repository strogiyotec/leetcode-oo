package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LeastNumberUniqueElementTestCase {

    private LeastNumberUniqueElement alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LeastNumberUniqueElement();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1,
            this.alg.findLeastNumOfUniqueInts(
                new int[]{2, 1, 1, 3, 3, 3},
                3
            )
        );
    }
}
