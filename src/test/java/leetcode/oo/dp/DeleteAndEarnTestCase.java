package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DeleteAndEarnTestCase {

    private DeleteAndEarn alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new DeleteAndEarn();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            9,
            this.alg.deleteAndEarn(
                new int[]{2, 2, 3, 3, 3, 4}
            )
        );
    }
}
