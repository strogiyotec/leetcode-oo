package leetcode.oo.duplicates;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Test {@link SortedArrayDup2}.
 */
public final class SortedArrayDup2TestCase {

    /**
     * Alg to test.
     */
    private SortedArrayDup2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SortedArrayDup2();
    }

    /**
     * Test amount of unique numbers.
     */
    @Test
    public void testUniqueCnt() {
        final int[] array = new int[]{1, 1, 1, 2, 2, 3};
        final int uniqueCnt = this.alg.removeDuplicates(array);
        Assert.assertThat(uniqueCnt, CoreMatchers.is(5));
        final int[] noDup = Arrays.copyOfRange(array, 0, uniqueCnt);
        Assert.assertThat(
                noDup,
                CoreMatchers.is(new int[]{1, 1, 2, 2, 3})
        );
    }

    /**
     * Test empty array.
     */
    @Test
    public void testEmptyArray() {
        Assert.assertThat(
                this.alg.removeDuplicates(new int[0]),
                CoreMatchers.is(0)
        );
    }

    /**
     * Test empty array.
     * When array has one element
     * then it has only 1 unique
     * number
     */
    @Test
    public void testSingleElementArray() {
        Assert.assertThat(
                this.alg.removeDuplicates(new int[]{10}),
                CoreMatchers.is(1)
        );
    }

}
