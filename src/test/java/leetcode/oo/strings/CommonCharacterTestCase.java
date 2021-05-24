package leetcode.oo.strings;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CommonCharacterTestCase {

    private CommonCharacter alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CommonCharacter();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList("e","l","l"),
            this.alg.commonChars(new String[]{"bella","label","roller"})
        );
        Assert.assertEquals(
            Arrays.asList("c", "o"),
            this.alg.commonChars(new String[]{"cool", "lock", "cook"})
        );
    }
}
