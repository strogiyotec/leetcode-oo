package leetcode.oo.ll;

import leetcode.oo.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RemoveDuplicatesTestCase {

    private RemoveDuplicates alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new RemoveDuplicates();
    }

    @Test
    public void test() {
        Assert.assertEquals(
                this.alg.deleteDuplicates(new ListNode(1).withNext(1).withNext(2)).toString(),
                "1_2"
        );
        Assert.assertEquals(
                this.alg.deleteDuplicates(new ListNode(1).withNext(1).withNext(1)).toString(),
                "1"
        );
    }
}
