package leetcode.oo.map;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReplaceWordsTestCase {

    private ReplaceWords alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReplaceWords();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "the cat was rat by the bat",
            this.alg.replaceWords(
                Arrays.asList(
                    "catt", "cat", "bat", "rat"
                ),
                "the cattle was rattled by the battery"
            )
        );
    }
}
