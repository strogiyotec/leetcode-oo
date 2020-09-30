package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PossibleBiPartTestCase {

    private PossibleBiPart alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PossibleBiPart();
    }

    @Test
    public void test() {
        Assert.assertFalse(
            this.alg.possibleBipartition(
                3,
                new int[][]{
                    {1, 2},
                    {1, 3},
                    {2, 3}
                }
            )
        );
        Assert.assertTrue(
            this.alg.possibleBipartition(
                4,
                new int[][]{
                    {1, 2},
                    {1, 3},
                    {2, 4}
                }
            )
        );
    }
}
