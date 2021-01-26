package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CheapestFlightTestCase {

    private CheapestFlight alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CheapestFlight();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            200L,
            this.alg.findCheapestPrice(
                3,
                new int[][]{
                    {0, 1, 100}, {1, 2, 100}, {0, 2, 500}
                },
                0,
                2,
                1
            )
        );
    }
}
