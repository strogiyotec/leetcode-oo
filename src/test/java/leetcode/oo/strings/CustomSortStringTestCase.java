package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CustomSortStringTestCase {

    private CustomSortString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CustomSortString();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "cbad",
            this.alg.customSortString(
                "cba",
                "abcd"
            )
        );
    }
}
