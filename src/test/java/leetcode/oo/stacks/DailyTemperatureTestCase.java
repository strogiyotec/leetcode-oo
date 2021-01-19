package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DailyTemperatureTestCase {

    private DailyTemperature alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DailyTemperature();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new int[]{1, 1, 4, 2, 1, 1, 0, 0},
            this.alg.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})
        );
    }
}
