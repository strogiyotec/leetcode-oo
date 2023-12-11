package leetcode.oo.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountUniqueCharactersOfAllSubstrTestCase {

    private CountUniqueCharactersOfAllSubstr alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountUniqueCharactersOfAllSubstr();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            8,
            this.alg.uniqueLetterString("ABA")
        );
    }
}
