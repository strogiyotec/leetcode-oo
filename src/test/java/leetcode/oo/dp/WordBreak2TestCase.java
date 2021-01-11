package leetcode.oo.dp;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WordBreak2TestCase {
    private WordBreak2 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new WordBreak2();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            2L,
            (long) this.alg.wordBreak(
                "catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")
            ).size()
        );
    }
}
