package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public final class CombinationSum2TestCase {

    private CombinationSum2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CombinationSum2();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.combinationSum2(new int[]{2,5,2,1,2}, 5),
                Arrays.asList(
                        Arrays.asList(1,2,2),
                        Collections.singletonList(5)
                )
        );
        Assert.assertEquals(
                this.alg.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8),
                Arrays.asList(
                        Arrays.asList(1, 2, 5),
                        Arrays.asList(1, 1, 6),
                        Arrays.asList(2, 6),
                        Arrays.asList(1, 7)
                )
        );
    }
}
