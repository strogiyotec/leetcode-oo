package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public final class SubsetsTestCase {

    private Subsets alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Subsets();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.subsets(new int[]{1, 2, 3}),
                Arrays.asList(
                        Collections.emptyList(),
                        Collections.singletonList(1),
                        Arrays.asList(1, 2),
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3),
                        Collections.singletonList(2),
                        Arrays.asList(2, 3),
                        Collections.singletonList(3)

                )
        );
    }
}
