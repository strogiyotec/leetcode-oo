package leetcode.oo.dp;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LargestDivisibleSetTestCase {

    private LargestDivisibleSubset alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LargestDivisibleSubset();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            List.of(1, 2, 4, 8),
            this.alg.largestDivisibleSubset(new int[]{1, 2, 4, 8})
        );
    }
}
