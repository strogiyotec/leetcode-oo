package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class ReverseKGroupsTestCase {

    private ReverseKGroups alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReverseKGroups();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "2_1_4_3_5",
            this.alg.reverseKGroup(
                new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5),
                2
            ).toString()
        );
    }
}
