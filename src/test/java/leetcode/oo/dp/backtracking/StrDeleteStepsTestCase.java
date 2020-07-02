package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StrDeleteStepsTestCase {

    private StrDeleteSteps alg;

    @Before
    public void init() {
        this.alg = new StrDeleteSteps();
    }

    @Test
    public void testSteps() {
        Assert.assertEquals(
                this.alg.minDistance("sea", "eat"),
                2
        );
    }
}
