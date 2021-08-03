package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CroakingTestCase {

    private Croaking alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new Croaking();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            -1,
            this.alg.minNumberOfFrogs("croakcrook")
        );
        Assert.assertEquals(
            1,
            this.alg.minNumberOfFrogs(
                "croakcroak"
            )
        );
        Assert.assertEquals(
            2,
            this.alg.minNumberOfFrogs(
                "crcoakroak"
            )
        );
    }
}
