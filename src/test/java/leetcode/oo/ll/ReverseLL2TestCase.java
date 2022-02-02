package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReverseLL2TestCase {

    private ReverseList2 alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReverseList2();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "1_4_3_2_5",
            this.alg.reverseBetween(
                new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5),
                2,
                4
            ).toString()
        );
    }
}
