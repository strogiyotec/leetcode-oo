package leetcode.oo.dp.backtracking;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public final class PermutationTestCase {

    private Permutations alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Permutations();
    }

    @Test
    public void test() {
        final List<List<Integer>> permutations = this.alg.permute(new int[]{1, 2, 3});
        Assert.assertEquals(permutations.size(), 6);
        Assert.assertThat(
                permutations,
                CoreMatchers.hasItem(
                        Arrays.asList(3, 2, 1)
                )
        );
        Assert.assertThat(
                permutations,
                CoreMatchers.hasItem(
                        Arrays.asList(2, 1, 3)
                )
        );
        Assert.assertThat(
                permutations,
                CoreMatchers.hasItem(
                        Arrays.asList(1, 2, 3)
                )
        );
    }
}
