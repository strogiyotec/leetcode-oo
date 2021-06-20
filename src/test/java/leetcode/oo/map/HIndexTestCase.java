package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class HIndexTestCase {

    private HIndex alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new HIndex();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.hIndex(
                new int[]{3, 0, 6, 1, 5}
            )
        );
    }

    @Test
    public void test2() {
        Assert.assertEquals(
            1,
            this.alg.hIndex(
                new int[]{1, 1, 3}
            )
        );
    }

}
