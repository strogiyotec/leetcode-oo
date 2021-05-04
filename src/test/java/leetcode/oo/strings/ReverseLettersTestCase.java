package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReverseLettersTestCase {

    private ReverseLetters alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReverseLetters();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "Qedo1ct-eeLg=ntse-T!",
            this.alg.reverseOnlyLetters("Test1ng-Leet=code-Q!")
        );
    }
}
