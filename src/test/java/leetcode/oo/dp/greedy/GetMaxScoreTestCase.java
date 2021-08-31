package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class GetMaxScoreTestCase {

    private GetMaxScore alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new GetMaxScore();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            30,
            this.alg.maxSum(
                new int[]{2, 4, 5, 8, 10},
                new int[]{4, 6, 8, 9}
            )
        );
    }
}
