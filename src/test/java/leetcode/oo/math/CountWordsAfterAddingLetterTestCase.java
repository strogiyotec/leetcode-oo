package leetcode.oo.math;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CountWordsAfterAddingLetterTestCase {

    private CountWordsAfterAddingLetter alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CountWordsAfterAddingLetter();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            2,
            this.alg.wordCount(
                new String[]{
                    "ant", "act", "tack"
                },
                new String[]{
                    "tack", "act", "acti"
                }
            )
        );

    }
}
