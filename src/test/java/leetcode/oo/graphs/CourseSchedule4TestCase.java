package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CourseSchedule4TestCase {

    private CourseSchedule4 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CourseSchedule4();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(true, false, true, false),
            this.alg.checkIfPrerequisite(
                5,
                new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}},
                new int[][]{{0, 4}, {4, 0}, {1, 3}, {3, 0}}
            )
        );
    }
}
