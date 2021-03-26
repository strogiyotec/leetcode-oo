package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class DistrubuteCoinsTestCase {

    private DistributeCoins alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new DistributeCoins();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(0);
        tree.right = new PlainTree(0);
        tree.left.right = new PlainTree(3);
        Assert.assertEquals(
            4,
            this.alg.distributeCoins(tree)
        );
    }
}
