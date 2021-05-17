package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SquareIsWhiteTestCase {

    private SquareIsWhite alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SquareIsWhite();
    }

    @Test
    public void test(){
        Assert.assertFalse(this.alg.squareIsWhite("a1"));
        Assert.assertTrue(this.alg.squareIsWhite("h3"));
    }
}
