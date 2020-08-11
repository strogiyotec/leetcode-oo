package leetcode.oo.pointers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReverseStringTestCase {

    private ReverseString alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReverseString();
    }

    @Test
    public void test() {
        final char[] word = new char[]{'h', 'a', 'n', 'n', 'a', 'h'};
        this.alg.reverseString(word);
        Assert.assertArrayEquals(
                word,
                new char[]{'h', 'a', 'n', 'n', 'a', 'h'}
        );
    }
    @Test
    public void test2() {
        final char[] word = new char[]{'h','e','l','l','o'};
        this.alg.reverseString(word);
        Assert.assertArrayEquals(
                word,
                new char[]{'o','l','l','e','h'}
        );
    }
}
