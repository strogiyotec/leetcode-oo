package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class FirstUniqueCharacterTestCase {

    private FirstUniqueCharacter alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new FirstUniqueCharacter();
    }

    @Test
    public void test(){
        Assert.assertEquals(
            0L,
            (long) this.alg.firstUniqChar("leetcode")
        );
    }

}
