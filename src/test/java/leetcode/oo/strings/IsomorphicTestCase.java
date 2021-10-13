package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class IsomorphicTestCase {

    private Isomorphic alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg= new Isomorphic();
    }

    @Test
    public void test(){
        Assert.assertFalse(
            this.alg.isIsomorphic(
                "foo",
                "bar"
            )
        );
    }
}
