package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Merge intervals;
 * See {@link <a href ="https://leetcode.com/problems/merge-intervals/">https://leetcode.com/problems/merge-intervals/</a>}
 */
public final class MergeIntervalsTestCase {

    private MergeIntervals alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MergeIntervals();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
            new int[][]{
                {1, 6},
                {8, 10},
                {15, 18}
            },
            this.alg.merge(
                new int[][]{
                    {1, 3},
                    {2, 6},
                    {8, 10},
                    {15, 18}
                }
            )
        );
        Assert.assertArrayEquals(
            new int[][]{
                {1, 10}
            },
            this.alg.merge(
                new int[][]{
                    {2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}
                }
            )
        );
    }
}
