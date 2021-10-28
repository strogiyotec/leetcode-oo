package leetcode.amazon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinDifficultyJobScheduleTestCase {

    private MinDifficultyJobSchedule alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinDifficultyJobSchedule();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            13,
            this.alg.minDifficulty(
                new int[]{
                    5, 2, 4, 1, 6, 2, 7
                },
                3
            )
        );
    }
}
