package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class GasStationTestCase {

    private GasStation alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new GasStation();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            3,
            this.alg.canCompleteCircuit(
                new int[]{1, 2, 3, 4, 5},
                new int[]{3, 4, 5, 1, 2}
            )
        );
        Assert.assertEquals(
            -1,
            this.alg.canCompleteCircuit(
                new int[]{2,3,4},
                new int[]{3,4,3}
            )
        );
    }
}
