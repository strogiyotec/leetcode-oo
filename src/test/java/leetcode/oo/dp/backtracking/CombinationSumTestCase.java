package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public final class CombinationSumTestCase {

    private CombinationSum alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CombinationSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.combinationSum(new int[]{2, 3, 5}, 8),
                Arrays.asList(
                        Arrays.asList(2, 2, 2, 2),
                        Arrays.asList(2, 3, 3),
                        Arrays.asList(3, 5)
                )
        );
        Assert.assertEquals(
                this.alg.combinationSum(new int[]{2, 3, 6, 7}, 7),
                Arrays.asList(
                        Arrays.asList(2, 2, 3),
                        Collections.singletonList(7)
                )
        );
    }
}
