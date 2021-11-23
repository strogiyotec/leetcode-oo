package leetcode.oo.map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class HeatersTestCase {

    private Heaters heaters;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.heaters = new Heaters();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            1,
            this.heaters.findRadius(
                new int[]{1, 2, 3},
                new int[]{2}
            )
        );
        Assert.assertEquals(
            1,
            this.heaters.findRadius(
                new int[]{1, 2, 3, 4},
                new int[]{1, 4}
            )
        );
    }
}
