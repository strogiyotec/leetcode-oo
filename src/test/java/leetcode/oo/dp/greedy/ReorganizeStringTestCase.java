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
                this.alg.reorganizeString("aab"),
                "aba"
        );
        Assert.assertEquals(
                this.alg.reorganizeString("abbabbaaab"),
                "ababababab"
        );
        Assert.assertEquals(
                this.alg.reorganizeString("aaba"),
                ""
        );
    }
}
