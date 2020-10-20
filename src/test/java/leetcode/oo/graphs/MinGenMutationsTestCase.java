package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinGenMutationsTestCase {
    private MinGenMutations alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinGenMutations();
    }

    @Test
    public void test() {
        Assert.assertEquals(3L,
            (long) this.alg.minMutation(
                "AAAAACCC",
                "AACCCCCC",
                new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"}
            )
        );
    }
}
