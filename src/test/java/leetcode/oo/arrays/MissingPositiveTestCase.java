package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MissingPositiveTestCase {

    private MissingPositive alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MissingPositive();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.firstMissingPositive(new int[]{2, 1}),
                3
        );
        Assert.assertEquals(
                this.alg.firstMissingPositive(new int[]{1}),
                2
        );
        Assert.assertEquals(
                this.alg.firstMissingPositive(new int[]{1, 2, 0}),
                3
        );
        Assert.assertEquals(
                this.alg.firstMissingPositive(new int[]{3, 4, -1, 1}),
                2
        );
        Assert.assertEquals(
                this.alg.firstMissingPositive(new int[]{7, 8, 9, 11, 12}),
                1
        );
    }
}
