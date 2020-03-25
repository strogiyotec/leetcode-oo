package leetcode.oo.reverse;

import leetcode.oo.ListNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link ReversedList}.
 */
public final class ReversedListTestCase {

    /**
     * Alg to test.
     */
    private ReversedList alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new ReversedList();
    }

    /**
     * Test that list was reversed.
     */
    @Test
    public void testReverse() {
        Assert.assertThat(
                this.alg.reverseList(
                        new ListNode(1)
                                .withNext(2)
                                .withNext(3)
                                .withNext(4)
                                .withNext(5)
                                .withNext(6)
                ).toString(),
                CoreMatchers.is("6_5_4_3_2_1")
        );
    }
}
