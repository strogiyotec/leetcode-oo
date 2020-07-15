package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UniquePathsWithObsTestCase {

    private UniquePathsWithObstacle alg;

    @Before
    public void init() {
        this.alg = new UniquePathsWithObstacle();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.uniquePathsWithObstacles(
                        new int[][]{
                                {0, 0},
                                {1, 1},
                                {0, 0}
                        }
                ),
                0
        );
        Assert.assertEquals(
                this.alg.uniquePathsWithObstacles(
                        new int[][]{
                                {1, 0}
                        }
                ),
                0
        );
        Assert.assertEquals(
                this.alg.uniquePathsWithObstacles(
                        new int[][]{
                                {1}

                        }
                ),
                0
        );
        Assert.assertEquals(
                this.alg.uniquePathsWithObstacles(
                        new int[][]{
                                {0, 0, 0},
                                {0, 1, 0},
                                {0, 0, 0}
                        }
                ),
                2
        );
    }
}
