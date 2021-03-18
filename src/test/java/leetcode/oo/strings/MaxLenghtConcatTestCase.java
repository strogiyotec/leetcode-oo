package leetcode.oo.strings;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxLenghtConcatTestCase {

    private MaxLengthConcatStr alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MaxLengthConcatStr();
    }

    @Test
    public void test(){
        Assert.assertEquals(
           6,
           this.alg.maxLength(
               Arrays.asList("cha", "r", "act", "ers")
           )
        );
    }
}
