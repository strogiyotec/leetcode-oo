package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SecondLargestDigitTestCase {

    private SecondLargestDigit alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SecondLargestDigit();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            0,
            this.alg.secondHighest("ck077")
        );
    }
}
