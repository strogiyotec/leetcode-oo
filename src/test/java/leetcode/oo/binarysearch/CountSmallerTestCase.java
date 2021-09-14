package leetcode.oo.binarysearch;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountSmallerTestCase {

    private CountSmallerAfterSelf alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountSmallerAfterSelf();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            List.of(2, 1, 1, 0),
            this.alg.countSmaller(new int[]{5, 2, 6, 1})
        );
    }
}
