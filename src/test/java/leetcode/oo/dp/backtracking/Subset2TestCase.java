package leetcode.oo.dp.backtracking;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class Subset2TestCase {

    private Subsets2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Subsets2();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(
                Collections.emptyList(),
                Collections.singletonList(1),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 2),
                Collections.singletonList(2),
                Arrays.asList(2, 2)
            ),
            this.alg.subsetsWithDup(new int[]{1, 2, 2})
        );
    }
}
