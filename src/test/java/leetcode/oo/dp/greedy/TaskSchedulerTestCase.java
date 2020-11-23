package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class TaskSchedulerTestCase {

    private TaskScheduler alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new TaskScheduler();
    }

    @Test
    public void test() {
        Assert.assertEquals(16L, (long) this.alg.leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2));
        Assert.assertEquals(8L, (long) this.alg.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2));
        Assert.assertEquals(6L, (long) this.alg.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0));
    }
}
