package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniqueSplitStrTestCase {

    private UniqueSplitString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new UniqueSplitString();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5L,
            (long) this.alg.maxUniqueSplit("ababccc")
        );
    }
}
