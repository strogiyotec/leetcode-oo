package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DetonateBombsTestCase {

    private DetonateBombs alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DetonateBombs();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            5,
            this.alg.maximumDetonation(
                new int[][]{
                    {1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}
                }
            )
        );
    }
}
