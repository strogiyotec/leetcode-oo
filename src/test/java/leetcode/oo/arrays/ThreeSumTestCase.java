package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public final class ThreeSumTestCase {

    private ThreeSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ThreeSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.threeSum(
                        new int[]{0, 0, 0, 0}
                ),
                Collections.singletonList(
                        Arrays.asList(0, 0, 0)
                )
        );
        Assert.assertEquals(
                this.alg.threeSum(
                        new int[]{-2, 0, 1, 1, 2}
                ),
                Arrays.asList(
                        Arrays.asList(-2, 1, 1),
                        Arrays.asList(-2, 0, 2)
                )
        );
        Assert.assertEquals(
                this.alg.threeSum(
                        new int[]{-1, 0, 1, 2, -1, -4}
                ),
                Arrays.asList(
                        Arrays.asList(-1, -1, 2),
                        Arrays.asList(-1, 0, 1)
                )
        );
    }
}
