package leetcode.oo.dp.backtracking;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LetterCasePermutationsTestCase {

    private LetterCasePermutations alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new LetterCasePermutations();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList("a1b2", "A1b2", "A1B2", "a1B2"),
            this.alg.letterCasePermutation("a1b2")
        );
        Assert.assertEquals(
            Collections.singletonList("12345"),
            this.alg.letterCasePermutation("12345")
        );
        Assert.assertEquals(
            Arrays.asList("C", "c"),
            this.alg.letterCasePermutation("C")
        );
    }
}
