package leetcode.oo.dp.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniquePath3TestCase {

    private UniquePath3 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new UniquePath3();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.uniquePathsIII(
                new int[][]{
                    {1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}
                }
            )
        );
    }
}
