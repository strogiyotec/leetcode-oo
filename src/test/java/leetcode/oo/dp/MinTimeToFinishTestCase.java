package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinTimeToFinishTestCase {

    private MinTimeToFinishJobs alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MinTimeToFinishJobs();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            11,
            this.alg.minimumTimeRequired(
                new int[]{1,2,4,7,8},
                2
            )
        );
    }
}
