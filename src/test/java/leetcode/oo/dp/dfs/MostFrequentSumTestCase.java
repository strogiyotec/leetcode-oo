package leetcode.oo.dp.dfs;

import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MostFrequentSumTestCase {

    private MostFrequentSum alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new MostFrequentSum();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(5);
        tree.left = new PlainTree(2);
        tree.right =new PlainTree(-3);
        Assert.assertArrayEquals(
            new int[]{-3,2,4},
            this.alg.findFrequentTreeSum(tree)
        );
    }
}
