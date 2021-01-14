package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CourseScheduleTestCase {

    private CourseSchedule alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CourseSchedule();
    }

    @Test
    public void test() {
        Assert.assertFalse(this.alg.canFinish(
            2,
            new int[][]{
                {1, 0},
                {0, 1}
            }
        ));
    }
}
