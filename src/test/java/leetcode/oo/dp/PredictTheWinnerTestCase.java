package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PredictTheWinnerTestCase {

    private PredictWinner alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PredictWinner();
    }

    @Test
    public void test(){
        Assert.assertTrue(
            this.alg.PredictTheWinner(
                new int[]{1, 5, 233, 7}
            )
        );
        Assert.assertFalse(
            this.alg.PredictTheWinner(
                new int[]{1, 5, 2}
            )
        );
    }
}
