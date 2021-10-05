package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfEventsTestCase {

    private NumberOfEvents alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfEvents();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4,
            this.alg.maxEvents(
                new int[][]{
                    {1, 4}, {4, 4}, {2, 2}, {3, 4}, {1, 1}
                }
            )
        );
        Assert.assertEquals(
            3,
            this.alg.maxEvents(
                new int[][]{
                    {1, 2}, {2, 3}, {3, 4}
                }
            )
        );
    }
}
