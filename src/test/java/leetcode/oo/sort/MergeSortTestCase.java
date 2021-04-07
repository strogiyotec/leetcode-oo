package leetcode.oo.sort;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

/**
 * Test {@link leetcode.oo.sort.Ints}.
 */
public final class MergeSortTestCase {

    /**
     * Test merge sort.
     */
    @Test
    public void testSort() {
        MatcherAssert.assertThat(
                new Ints(
                        new int[]{87, 17, 6, 22, 3, 41, 13, 54}
                ).mergeSorted(),
                CoreMatchers.is(
                        new int[]{3, 6, 13, 17, 22, 41, 54, 87}
                )
        );
    }
}
