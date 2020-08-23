package leetcode.oo.pointers;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CompressStringTestCase {

    private CompressString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CompressString();
    }

    @Test
    public void test2() {
        final char[] array = "aabbc".toCharArray();
        Assert.assertEquals(
                this.alg.compress(array),
                4
        );
        Assert.assertThat(new String(array), CoreMatchers.containsString("a2b2c"));
    }
    @Test
    public void test() {
        final char[] array = "aabbccc".toCharArray();
        Assert.assertEquals(
                this.alg.compress(array),
                6
        );
        Assert.assertThat(new String(array), CoreMatchers.containsString("a2b2c3"));
    }
}
