package leetcode.oo.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class WordsByCharactersTestCase {

    private WordsByCharacters alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new WordsByCharacters();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6L,
            (long) this.alg.countCharacters(
                new String[]{
                    "cat", "bt", "hat", "tree"
                },
                "atach"
            )
        );
    }
}
