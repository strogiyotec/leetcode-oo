package leetcode.oo.dp.sliding;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FruitIntoBacketsTestCase {

    private FruitIntoBackets alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new FruitIntoBackets();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5,
            this.alg.totalFruit(
                new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}
            )
        );
    }
}
