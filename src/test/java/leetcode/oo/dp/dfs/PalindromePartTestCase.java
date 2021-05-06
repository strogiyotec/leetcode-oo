package leetcode.oo.dp.dfs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PalindromePartTestCase {

    private PalindromePartition alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new PalindromePartition();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            Arrays.asList(
                Arrays.asList("a","a","b"),
                Arrays.asList("aa","b")
            ),
            this.alg.partition("aab")
        );
    }
}
