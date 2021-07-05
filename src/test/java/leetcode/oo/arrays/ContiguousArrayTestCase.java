package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ContiguousArrayTestCase {

    private ContiguousArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ContiguousArray();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6,
            this.alg.findMaxLength(
                new int[]{0, 0, 1, 0, 0, 0, 1, 1}
            )
        );
    }
}
