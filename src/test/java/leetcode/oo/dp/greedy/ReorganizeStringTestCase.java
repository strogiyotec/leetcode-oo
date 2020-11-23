package leetcode.oo.dp.greedy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReorganizeStringTestCase {

    private ReorganizeString alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ReorganizeString();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            "",
            this.alg.reorganizeString("bbbbbb")
        );
        Assert.assertEquals(
            "aba",
            this.alg.reorganizeString("aab")
        );
        Assert.assertEquals(
            "ababababab",
            this.alg.reorganizeString("abbabbaaab")
        );
        Assert.assertEquals(
            "",
            this.alg.reorganizeString("aaba")
        );
    }
}
