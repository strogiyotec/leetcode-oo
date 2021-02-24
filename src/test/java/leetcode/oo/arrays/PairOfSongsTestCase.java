package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PairOfSongsTestCase {

    private PairOfSongs alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PairOfSongs();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.numPairsDivisibleBy60(
                new int[]{
                    30, 20, 150, 100, 40
                }
            )
        );
    }
}
