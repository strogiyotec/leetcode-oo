package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReorderListTestCase {

    private ReorderList alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new ReorderList();
    }

    @Test
    public void test(){
        final ListNode list = new ListNode(1).withNext(2).withNext(3).withNext(4);
        this.alg.reorderList(list);
        Assert.assertEquals(
                list,
                new ListNode(1).withNext(4).withNext(2).withNext(3)
        );
    }
}
