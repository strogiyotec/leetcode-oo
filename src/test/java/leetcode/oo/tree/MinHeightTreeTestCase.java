package leetcode.oo.tree;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinHeightTreeTestCase {

    private MinHeightTree alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinHeightTree();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(3, 4),
            this.alg.findMinHeightTrees(
                6,
                new int[][]{
                    {3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}
                }
            )
        );
    }
}
