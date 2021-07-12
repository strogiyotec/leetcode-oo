package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinCostForTicketTestCase {

    private MinCostForTicket alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinCostForTicket();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            11,
            this.alg.mincostTickets(
                new int[]{1, 4, 6, 7, 8, 20},
                new int[]{2, 7, 15}
            )
        );
    }
}
