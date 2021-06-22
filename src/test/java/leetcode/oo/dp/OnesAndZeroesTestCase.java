package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class OnesAndZeroesTestCase {

    private OnesAndZeroes alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new OnesAndZeroes();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.findMaxForm(
                new String[]{"10", "0001", "111001", "1", "0"},
                4,
                3
            )
        );
        Assert.assertEquals(
            4,
            this.alg.findMaxForm(
                new String[]{"10", "0001", "111001", "1", "0"},
                5,
                3
            )
        );
        Assert.assertEquals(
            2,
            this.alg.findMaxForm(
                new String[]{"10", "1", "0"},
                1,
                1
            )
        );
    }
}
