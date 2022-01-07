package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NextPermutationTestCase {

    private NextPermutation alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NextPermutation();
    }

    @Test
    public void test() {
        final int[] ints = {1, 2, 3};
        this.alg.nextPermutation(ints);
        Assert.assertArrayEquals(
            new int[]{1,3,2},
            ints
        );
    }

}
