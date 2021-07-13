package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SwapNodesInPairsTestCase {

    private SwapNodesInPairs alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SwapNodesInPairs();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            "2_1_4_3",
            this.alg.swapPairs(
                new ListNode(1).withNext(2).withNext(3).withNext(4)
            ).toString()
        );
    }
}
