package leetcode.oo.strings;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SmallestStringWithSwapsTestCase {

    private SmallestStringWithSwaps alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SmallestStringWithSwaps();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "abcd",
            this.alg.smallestStringWithSwaps(
                "dcab",
                List.of(
                    List.of(0, 3),
                    List.of(1, 2),
                    List.of(0, 2)
                )
            )
        );
    }
}
