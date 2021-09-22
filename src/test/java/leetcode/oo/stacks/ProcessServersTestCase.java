package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ProcessServersTestCase {

    private ProcessServers alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ProcessServers();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[]{1, 4, 1, 4, 1, 3, 2},
            this.alg.assignTasks(
                new int[]{5, 1, 4, 3, 2},
                new int[]{2, 1, 2, 4, 5, 2, 1}
            )
        );
        Assert.assertArrayEquals(
            new int[]{2, 2, 0, 2, 1, 2},
            this.alg.assignTasks(
                new int[]{3, 3, 2},
                new int[]{1, 2, 3, 2, 1, 2}
            )
        );
    }
}
