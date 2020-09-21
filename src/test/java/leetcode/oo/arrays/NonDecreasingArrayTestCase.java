package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Almas Abdrazak (almas337519@gmail.com)
 */
public final class NonDecreasingArrayTestCase {

    private NonDecreasingArray alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NonDecreasingArray();
    }

    @Test
    public void test() {
        Assert.assertTrue(this.alg.checkPossibility(new int[]{5, 7, 1, 8}));
        Assert.assertFalse(this.alg.checkPossibility(new int[]{3, 4, 2, 3}));
        Assert.assertTrue(this.alg.checkPossibility(new int[]{4, 2, 3}));
        Assert.assertTrue(this.alg.checkPossibility(new int[]{1, 4, 1, 2}));
    }
}
