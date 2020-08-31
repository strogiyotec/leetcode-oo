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
    public void test4() {
        final char[] array = "abc".toCharArray();
        Assert.assertEquals(
                this.alg.compress(array),
                3
        );
        Assert.assertThat(new String(array), CoreMatchers.containsString("abc"));
    }

    @Test
    public void test3() {
        final char[] array = "a".toCharArray();
        Assert.assertEquals(
                this.alg.compress(array),
                1
        );
        Assert.assertThat(new String(array), CoreMatchers.containsString("a"));
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
