package leetcode.oo.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class SmallestStringFromLeadTestCase {
    private SmallestStringFromLeaf alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new SmallestStringFromLeaf();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree((int) 'z' - (int) 'a');
        tree.left = new PlainTree('b' - 'a');
        tree.left.left = new PlainTree('b' - 'a');
        tree.left.right = new PlainTree('d' - 'a');
        tree.right = new PlainTree('d' - 'a');
        tree.right.left = new PlainTree('a' - 'a');
        tree.right.right = new PlainTree('c' - 'a');
        Assert.assertEquals(
            "adz",
            this.alg.smallestFromLeaf(tree)
        );
    }
}
