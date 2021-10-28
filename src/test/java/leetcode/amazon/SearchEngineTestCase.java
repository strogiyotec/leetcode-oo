package leetcode.amazon;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SearchEngineTestCase {

    private SearchSuggestionSystem alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SearchSuggestionSystem();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            List.of(
                List.of("mobile", "moneypot", "monitor"),
                List.of("mobile", "moneypot", "monitor"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad")
            )
            ,
            this.alg.suggestedProducts(
                new String[]{
                    "mobile", "mouse", "moneypot", "monitor", "mousepad"
                },
                "mouse"
            )
        );
    }
}
