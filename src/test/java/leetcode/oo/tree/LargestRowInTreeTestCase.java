package leetcode.oo.tree;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class LargestRowInTreeTestCase {

    private LargestRowInTree alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new LargestRowInTree();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(3);
        tree.left.left = new PlainTree(5);
        tree.left.right = new PlainTree(3);
        tree.right = new PlainTree(2);
        tree.right.right = new PlainTree(9);
        Assert.assertEquals(
            Arrays.asList(1,3,9),
            this.alg.largestValues(tree)
        );
    }
}
