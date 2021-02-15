package leetcode.oo.dp;

import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class HouseRobber3TestCase {

    private HouseRobber3 alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new HouseRobber3();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(4);
        tree.left = new PlainTree(1);
        tree.left.left = new PlainTree(2);
        tree.left.left.left = new PlainTree(3);
        Assert.assertEquals(
            7,
            this.alg.rob(tree)
        );
    }
}
