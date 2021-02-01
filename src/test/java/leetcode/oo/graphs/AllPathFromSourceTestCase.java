package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AllPathFromSourceTestCase {

    private AllPathFromSource alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new AllPathFromSource();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList(Arrays.asList(0,1,3),Arrays.asList(0,2,3)),
            this.alg.allPathsSourceTarget(
                new int[][]{
                    {1, 2},
                    {3},
                    {3},
                    {}
                }
            )
        );
    }

}
