package leetcode.oo.tree.traversal;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class PostOrderTestCase {

    private PostOrderTraversal alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new PostOrderTraversal();
    }

    @Test
    public void test() {
        final PostOrderTraversal.Node node = new PostOrderTraversal.Node(1);
        final PostOrderTraversal.Node child = new PostOrderTraversal.Node(3);
        child.children = Arrays.asList(
            new PostOrderTraversal.Node(5),
            new PostOrderTraversal.Node(6)
        );
        node.children = Arrays.asList(
            child,
            new PostOrderTraversal.Node(2),
            new PostOrderTraversal.Node(4)
        );
        Assert.assertEquals(
            Arrays.asList(5, 6, 3, 2, 4, 1),
            this.alg.postorder(node)
        );
    }
}
