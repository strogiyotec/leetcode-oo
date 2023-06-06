package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StoneGame4TestCase {

    private StoneGame4 stoneGame4;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.stoneGame4 = new StoneGame4();
    }

    @Test
    public void test(){
        Assert.assertFalse(this.stoneGame4.winnerSquareGame(7));
        Assert.assertTrue(this.stoneGame4.winnerSquareGame(4));
        Assert.assertTrue(this.stoneGame4.winnerSquareGame(1));
    }
}
