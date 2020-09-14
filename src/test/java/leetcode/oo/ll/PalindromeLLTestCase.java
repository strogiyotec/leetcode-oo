package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PalindromeLLTestCase {

    private PalindromeLL alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PalindromeLL();
    }

    @Test
    public void test1() {
        Assert.assertTrue(
                this.alg.isPalindrome(new ListNode(1).withNext(2).withNext(2).withNext(1))
        );
    }

    @Test
    public void test2() {
        Assert.assertTrue(
                this.alg.isPalindrome(new ListNode(1).withNext(0).withNext(1))
        );
    }

    @Test
    public void test3() {
        Assert.assertFalse(
                this.alg.isPalindrome(new ListNode(1).withNext(2))
        );
    }
}
