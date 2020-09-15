package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class IntersectionTestCase {

    private Intersection alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new Intersection();
    }

    @Test
    public void testValid() {
        final ListNode intersection = new ListNode(9).withNext(11);
        Assert.assertEquals(
                this.alg.getIntersectionNode(
                        new ListNode(1).withNext(3).withNext(5).withNext(7).withNext(intersection),
                        new ListNode(2).withNext(4).withNext(intersection)
                ),
                intersection
        );
    }

    @Test
    public void testNoIntersectionSameLength() {
        Assert.assertNull(
                this.alg.getIntersectionNode(
                        new ListNode(1).withNext(3).withNext(5),
                        new ListNode(2).withNext(4).withNext(6)
                )
        );
    }

    @Test
    public void testNoIntersectionDiffLength() {
        Assert.assertNull(
                this.alg.getIntersectionNode(
                        new ListNode(1).withNext(2).withNext(3).withNext(4).withNext(5),
                        new ListNode(6).withNext(7).withNext(8)
                )
        );
    }
}
