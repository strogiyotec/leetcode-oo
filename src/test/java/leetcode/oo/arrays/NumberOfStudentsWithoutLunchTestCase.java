package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class NumberOfStudentsWithoutLunchTestCase {

    private NumberOfStudentsWithoutLunch alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new NumberOfStudentsWithoutLunch();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.countStudents(
                new int[]{1, 1, 1, 0, 0, 1},
                new int[]{1, 0, 0, 0, 1, 1}
            )
        );
        Assert.assertEquals(
            0,
            this.alg.countStudents(
                new int[]{1, 1, 0, 0},
                new int[]{0, 1, 0, 1}
            )
        );
    }
}
