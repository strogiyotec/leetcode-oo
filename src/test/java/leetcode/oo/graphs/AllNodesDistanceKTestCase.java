package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.List;
import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AllNodesDistanceKTestCase {

    private AllNodesDistanceK alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new AllNodesDistanceK();
    }

    @Test
    public void test() {
        final PlainTree tree = new PlainTree(3);
        final PlainTree left = new PlainTree(5);
        left.left = new PlainTree(6);
        left.right = new PlainTree(2);
        left.right.left = new PlainTree(7);
        left.right.right = new PlainTree(4);
        tree.left = left;
        tree.right = new PlainTree(1);
        tree.right.left = new PlainTree(0);
        tree.right.right = new PlainTree(8);
        final List<Integer> solution = this.alg.distanceK(
            tree, left, 2
        );
        solution.sort(null);
        Assert.assertEquals(
            Arrays.asList(1,4,7),
            solution
        );
    }
}
