package leetcode.oo.sort;

import leetcode.oo.ListNode;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test {@link SortedLists}.
 */
public final class SortedListsTestCase {

    /**
     * Alg to test.
     */
    private SortedLists alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new SortedLists();
    }

    /**
     * Test sort.
     */
    @Test
    public void testSort() {
        Assert.assertThat(
                this.alg.mergeKList(
                        new ListNode[]{
                                new ListNode(1).withNext(4).withNext(5),
                                new ListNode(1).withNext(3).withNext(4),
                                new ListNode(2).withNext(6),
                        }
                ).toString(),
                CoreMatchers.is(
                        "1_1_2_3_4_4_5_6"
                )
        );
    }

    /**
     * Test sort skip nulls.
     */
    @Test
    public void testSortWithNulls() {
        Assert.assertThat(
                this.alg.mergeKList(
                        new ListNode[]{
                                new ListNode(1).withNext(4).withNext(5),
                                null,
                                new ListNode(2).withNext(6),
                        }
                ).toString(),
                CoreMatchers.is(
                        "1_2_4_5_6"
                )
        );
    }

    /**
     * Test sort empty array.
     */
    @Test
    public void testEmpty() {
        Assert.assertNull(this.alg.mergeKList(new ListNode[0]));
    }
}
