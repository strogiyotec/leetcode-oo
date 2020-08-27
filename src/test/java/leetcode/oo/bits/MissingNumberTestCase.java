package leetcode.oo.bits;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MissingNumberTestCase {

    private MissingNumber alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MissingNumber();
    }

    @Test
    public void test() {
        Assert.assertEquals(this.alg.missingNumber(new int[]{3, 0, 1}), 2);
    }
}
