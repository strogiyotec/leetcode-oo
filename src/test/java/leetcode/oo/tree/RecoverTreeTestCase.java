package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class RecoverTreeTestCase {

    private RecoverTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new RecoverTree();
    }

    @Test
    public void test(){
        final PlainTree tree = this.alg.recoverFromPreorder("1-2--3--4-5--6--7");
        Assert.assertEquals(
            1,
            tree.val
        );
        Assert.assertEquals(
            2,
            tree.left.val
        );
        Assert.assertEquals(
            5,
            tree.right.val
        );
        Assert.assertEquals(
            3,
            tree.left.left.val
        );
        Assert.assertEquals(
            4,
            tree.left.right.val
        );
        Assert.assertEquals(
            7,
            tree.right.right.val
        );
        Assert.assertEquals(
            6,
            tree.right.left.val
        );
    }
}
