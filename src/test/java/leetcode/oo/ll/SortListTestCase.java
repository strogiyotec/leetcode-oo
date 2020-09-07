package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SortListTestCase {

    private SortList alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SortList();
    }

    @Test
    public void test() {
         Assert.assertEquals(
                 this.alg.sortList(new ListNode(4).withNext(2).withNext(1).withNext(3)),
                 new ListNode(1).withNext(2).withNext(3).withNext(4)
         );
    }
}
