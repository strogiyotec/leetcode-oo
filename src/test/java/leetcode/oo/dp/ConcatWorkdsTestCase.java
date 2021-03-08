package leetcode.oo.dp;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ConcatWorkdsTestCase {

    private ConcatWords alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ConcatWords();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList("catsdogcats", "dogcatsdog", "ratcatdogcat"),
            this.alg.findAllConcatenatedWordsInADict(
                new String[]{
                    "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
                }
            )
        );
    }
}
