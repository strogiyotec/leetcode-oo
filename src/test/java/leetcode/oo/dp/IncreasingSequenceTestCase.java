package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class IncreasingSequenceTestCase {

    private IncreasingSequence alg;

    @Before
    public void init() {
        this.alg = new IncreasingSequence();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.lengthOfLIS(
                        new int[]{10, 9, 2, 5, 3, 7, 101, 18}
                        ),
                4
        );
    }
}
