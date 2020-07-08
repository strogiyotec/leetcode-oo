package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CoinChangeTestCase {

    private CoinChange alg;

    @Before
    public void init() {
        this.alg = new CoinChange();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.count(new int[]{186, 419, 83, 408}, 6249),
                20
        );
        Assert.assertEquals(
                this.alg.count(new int[]{1, 2, 5}, 11),
                3
        );
    }

}
