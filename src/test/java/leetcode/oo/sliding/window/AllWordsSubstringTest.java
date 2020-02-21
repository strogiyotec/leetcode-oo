package leetcode.oo.sliding.window;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Test Substring with Concatenation of All Words.
 */
public final class AllWordsSubstringTest {

    /**
     * Alg to test.
     */
    private final AllWordsSubstring allWordsSubstring =
            new AllWordsSubstring();

    /**
     * Concat indexes test.
     */
    @Test
    public void findSubstring() {
        Assert.assertThat(
                this.allWordsSubstring.findSubstring(
                        "barfoothefoobarman",
                        new String[]{"foo", "bar"}
                ),
                CoreMatchers.is(
                        Arrays.asList(0, 9)
                )
        );
        Assert.assertThat(
                this.allWordsSubstring.findSubstring(
                        "wordgoodgoodgoodbestword",
                        new String[]{"word", "good", "best", "word"}
                ),
                CoreMatchers.is(
                        Collections.emptyList()
                )
        );
        Assert.assertThat(
                this.allWordsSubstring.findSubstring(
                        "wordgoodgoodgoodbestword",
                        new String[0]
                ),
                CoreMatchers.is(
                        Collections.emptyList()
                )
        );
    }
}