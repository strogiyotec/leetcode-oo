package leetcode.oo.map;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FallingSquaresTestCase {

    private FallingSquares alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new FallingSquares();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(1,3,6),
            this.alg.fallingSquares(
                new int[][]{
                    {7,1},
                    {3,3},
                    {7,5}
                }
            )
        );
        Assert.assertEquals(
            Arrays.asList(6,6,8),
            this.alg.fallingSquares(
                new int[][]{
                    {9,6},
                    {2,2},
                    {2,6}
                }
            )
        );
        Assert.assertEquals(
            Arrays.asList(2, 5, 5),
            this.alg.fallingSquares(
                new int[][]{
                    {1, 2},
                    {2, 3},
                    {6, 1}
                }
            )
        );
    }
}
