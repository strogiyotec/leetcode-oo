package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DistinctSequenceTestCase {

    private DistinctSubSeq alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DistinctSubSeq();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            5,
            this.alg.numDistinct(
                "babgbag",
                "bag"
            )
        );
    }

}
