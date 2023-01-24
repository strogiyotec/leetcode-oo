package leetcode.oo.ll;

import java.util.Arrays;
import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SplitLLTestCase {

    private SplitLinkedList alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SplitLinkedList();
    }

    @Test
    public void test() {
        final ListNode[] listNodes = this.alg.splitListToParts(
            new ListNode(1).withNext(2).withNext(3), 5
        );
        Assert.assertEquals(
            "[1, 2, 3, null, null]",
            Arrays.toString(listNodes)
        );
    }

    @Test
    public void test2() {
        final ListNode[] listNodes = this.alg.splitListToParts(
            new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5).withNext(6).withNext(7).withNext(8).withNext(9).withNext(10),
            3
        );
        System.out.println(Arrays.toString(listNodes));
    }

    @Test
    public void test3() {
        final ListNode[] listNodes = this.alg.splitListToParts(
            new ListNode(0).withNext(1).withNext(2),
            3
        );
        System.out.println(Arrays.toString(listNodes));
    }
}
