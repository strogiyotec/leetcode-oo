package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class OddEvenLLTestCase {

    private OddEvenLL alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new OddEvenLL();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            this.alg.oddEvenList(new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5)).toString(),
            "1_3_5_2_4"
        );
        Assert.assertEquals(
            this.alg.oddEvenList(new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5).withNext(6).withNext(7).withNext(8)).toString(),
            "1_3_5_7_2_4_6_8"
        );
    }

}
