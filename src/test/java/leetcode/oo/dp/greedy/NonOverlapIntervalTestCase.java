package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NonOverlapIntervalTestCase {

    private NonOverlapInterval alg;

    @Before
    public void init() {
        this.alg = new NonOverlapInterval();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.eraseOverlapIntervals(new int[][]{
                        {1, 2},
                        {2, 3},
                        {3, 4},
                        {1, 3},
                }),
                1
        );
        Assert.assertEquals(
                this.alg.eraseOverlapIntervals(new int[][]{
                        {1, 2},
                        {1, 2},
                        {1, 2},
                }),
                2
        );
    }
}
