package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class KStrongestValuesTestCase {

    private KStrongestValues alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new KStrongestValues();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{5, 1},
            this.alg.getStrongest(new int[]{1, 2, 3, 4, 5}, 2)
        );
        Assert.assertArrayEquals(
            new int[]{22, 17},
            this.alg.getStrongest(new int[]{-7, 3, 17, 22}, 2)
        );
    }
}
