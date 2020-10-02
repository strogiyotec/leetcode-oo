package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WordLadderTestCase {

    private WordLadder alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WordLadder();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            4L,
            (long) this.alg.ladderLength("hit", "dog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"))
        );
    }
}
