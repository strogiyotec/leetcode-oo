package leetcode.oo.tree;

import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public final class FlipBinaryTreeTestCase {

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        final List<Integer> solution = new FlipBinaryTree().flipMatchVoyage(
            tree,
            new int[]{1, 3, 2}
        );
        Assert.assertEquals(
            Collections.singletonList(1),
            solution
        );
    }
}
