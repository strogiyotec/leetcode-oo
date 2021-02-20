package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MergeAccountsTestCase {

    private MergeAccounts alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MergeAccounts();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Collections.singletonList(
                Arrays.asList("David", "David0@m.co", "David1@m.co", "David3@m.co", "David4@m.co", "David5@m.co")
            ),
            this.alg.accountsMerge(
                Arrays.asList(
                    Arrays.asList("David", "David0@m.co", "David4@m.co", "David3@m.co"),
                    Arrays.asList("David", "David5@m.co", "David5@m.co", "David0@m.co"),
                    Arrays.asList("David", "David1@m.co", "David4@m.co", "David0@m.co"),
                    Arrays.asList("David", "David0@m.co", "David1@m.co", "David3@m.co"),
                    Arrays.asList("David", "David4@m.co", "David1@m.co", "David3@m.co")
                )
            )
        );
    }
}
