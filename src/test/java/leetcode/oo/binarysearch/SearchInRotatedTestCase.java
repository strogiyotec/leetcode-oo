package leetcode.oo.binarysearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SearchInRotatedTestCase {

    private SearchInRotated alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SearchInRotated();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.search(
                new int[]{4, 5, 6, 7, 0, 1, 2},
                0
            )
        );
    }
}
