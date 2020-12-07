package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SCSTestCase {

    private SCS alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SCS();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "fecable",
            this.alg.shortestCommonSupersequence(
                "feabl", "cabe"
            )
        );
    }
}
