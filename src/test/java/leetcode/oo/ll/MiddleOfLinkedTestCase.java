package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Test;

public final class MiddleOfLinkedTestCase {

    @Test
    public void testOdd() {
        final MiddleOfLinked alg = new MiddleOfLinked();
        Assert.assertEquals(
                alg.middleNode(new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5).withNext(6)).val,
                4
        );
    }

    @Test
    public void testEven() {
        final MiddleOfLinked alg = new MiddleOfLinked();
        Assert.assertEquals(
                alg.middleNode(new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5)).val,
                3
        );
    }
}
