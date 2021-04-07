package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class EvaluateDivisionTestCase {

    private EvaluateDivision alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new EvaluateDivision();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new double[]{6.0, 0.5, -1.0, 1.0, -1.0},
            this.alg.calcEquation(
                Arrays.asList(
                    Arrays.asList("a", "b"),
                    Arrays.asList("b", "c")
                ),
                new double[]{2.0, 3.0},
                Arrays.asList(
                    Arrays.asList("a", "c"),
                    Arrays.asList("b", "a"),
                    Arrays.asList("a", "e"),
                    Arrays.asList("a", "a"),
                    Arrays.asList("x", "x")
                )
            ),
            0
        );
    }
}
