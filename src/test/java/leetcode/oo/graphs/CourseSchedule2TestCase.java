package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CourseSchedule2TestCase {

    private CourseSchedule2 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new CourseSchedule2();
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(
            new int[]{0,1,2,3},
            this.alg.findOrder(
                4,
                new int[][]{
                    {1, 0},
                    {2, 0},
                    {3, 1},
                    {3, 2}
                }
            )
        );
    }

}
