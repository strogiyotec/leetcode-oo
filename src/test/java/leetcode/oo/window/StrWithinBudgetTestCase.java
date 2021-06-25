package leetcode.oo.window;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class StrWithinBudgetTestCase {

    private StrWithinBudget alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new StrWithinBudget();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3,
            this.alg.equalSubstring(
                "abcd",
                "bcdf",
                3
            )
        );
        Assert.assertEquals(
            1,
            this.alg.equalSubstring(
                "abcd",
                "cdef",
                3
            )
        );
        Assert.assertEquals(
            4,
            this.alg.equalSubstring(
                "krpgjbjjznpzdfy",
                "nxargkbydxmsgby",
                14
            )
        );
    }
}
