package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AlienDictionaryTestCase {

    private AlienDictionary alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new AlienDictionary();
    }

    @Test
    public void test() {
        Assert.assertFalse(
            this.alg.isAlienSorted(
                new String[]{
                    "apple", "app"
                },
                "abcdefghijklmnopqrstuvwxyz"
            )
        );
    }

}
