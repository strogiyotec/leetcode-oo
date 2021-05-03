package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SimplifyPathTestCase {

    private SimplifyPath alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SimplifyPath();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            "/c",
            this.alg.simplifyPath("/a/./b/../../c/")
        );
    }
}
