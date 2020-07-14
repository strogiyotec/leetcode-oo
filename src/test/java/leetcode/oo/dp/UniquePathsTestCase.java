package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniquePathsTestCase {

    private UniquePaths alg;

    @Before
    public void init() {
        this.alg = new UniquePaths();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.uniquePaths(1,1),
                1
        );
        Assert.assertEquals(
                this.alg.uniquePaths(7, 3),
                28
        );
        Assert.assertEquals(
                this.alg.uniquePaths(3, 2),
                3
        );
    }
}
