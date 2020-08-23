package leetcode.oo.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class UncommonWordsTestCase {

    private UncommonWords alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new UncommonWords();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(
                this.alg.uncommonFromSentences(
                        "apple apple",
                        "banana"
                ),
                new String[]{"banana"}
        );
        Assert.assertArrayEquals(
                this.alg.uncommonFromSentences(
                        "this apple is sweet",
                        "this apple is sour"
                ),
                new String[]{"sour","sweet"}
        );

    }
}
