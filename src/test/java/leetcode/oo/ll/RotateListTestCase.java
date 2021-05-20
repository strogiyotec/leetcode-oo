package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RotateListTestCase {

    private RotateList alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RotateList();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "4_5_1_2_3",
            this.alg.rotateRight(
                new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5), 2
            ).toString()
        );
        Assert.assertEquals(
            "1",
            this.alg.rotateRight(
                new ListNode(1), 1
            ).toString()
        );
    }
}
