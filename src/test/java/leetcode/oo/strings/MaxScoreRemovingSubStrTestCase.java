package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxScoreRemovingSubStrTestCase {

    private MaxScoreRemovingSubstr alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxScoreRemovingSubstr();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            19,
            this.alg.maximumGain(
                "cdbcbbaaabab",
                4,
                5
            )
        );
    }
}
