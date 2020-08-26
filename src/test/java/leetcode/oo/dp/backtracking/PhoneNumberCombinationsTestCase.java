package leetcode.oo.dp.backtracking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public final class PhoneNumberCombinationsTestCase {
    private PhoneNumberCombinations alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PhoneNumberCombinations();
    }

    @Test
    public void test() {
        final List<String> combinations = this.alg.letterCombinations("23");
        Assert.assertEquals(combinations.size(), 9);
    }

    @Test
    public void testEmpty() {
        final List<String> combinations = this.alg.letterCombinations("");
        Assert.assertEquals(combinations.size(), 0);
    }
}
