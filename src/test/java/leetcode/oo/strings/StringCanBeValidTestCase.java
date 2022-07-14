package leetcode.oo.strings;

import org.junit.Assert;
import org.junit.Test;

public final class StringCanBeValidTestCase {

    @Test
    public void test() {
        Assert.assertTrue(
            new StringCanBeValid().canBeValid(
                "()",
                "11"
            )
        );
    }

    @Test
    public void test2() {
        Assert.assertTrue(
            new StringCanBeValid().canBeValid(
                "))()))",
                "010100"
            )
        );
    }
}
