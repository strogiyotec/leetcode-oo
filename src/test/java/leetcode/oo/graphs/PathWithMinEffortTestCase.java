package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PathWithMinEffortTestCase {

    private PathWithMinEffort alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PathWithMinEffort();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            0,
            this.alg.minimumEffortPath(
                new int[][]{
                    {1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}
                }
            )
        );
        Assert.assertEquals(
            2,
            this.alg.minimumEffortPath(
                new int[][]{
                    {1, 2, 2}, {3, 8, 2}, {5, 3, 5}
                }
            )
        );
        Assert.assertEquals(
            9,
            this.alg.minimumEffortPath(
                new int[][]{
                    {1,10,6,7,9,10,4,9}
                }
            )
        );
    }
}
