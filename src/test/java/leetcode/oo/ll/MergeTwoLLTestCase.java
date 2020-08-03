package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MergeTwoLLTestCase {

    private MergeTwoLinkedList alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MergeTwoLinkedList();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.mergeTwoLists(
                        new ListNode(1).withNext(2).withNext(4),
                        new ListNode(1).withNext(3).withNext(4)
                ).toString(),
                "1_1_2_3_4_4"
        );
    }
}
