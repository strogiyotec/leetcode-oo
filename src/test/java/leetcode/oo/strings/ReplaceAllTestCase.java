package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReplaceAllTestCase {

    private ReplaceAll alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ReplaceAll();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            "babubabawab",
            this.alg.modifyString("?a?ub???w?b")
        );
    }
}
