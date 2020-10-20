package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MaxDepthNTreeTestCase {

    private MaxDepthNTree alg;

    private MaxDepthNTree.Node node;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MaxDepthNTree();
        this.node = new MaxDepthNTree.Node(1);
        this.node.children = Arrays.asList(
            new MaxDepthNTree.Node(
                3,
                Arrays.asList(
                    new MaxDepthNTree.Node(5),
                    new MaxDepthNTree.Node(6)
                )
            ),
            new MaxDepthNTree.Node(2),
            new MaxDepthNTree.Node(4)
        );
    }

    @Test
    public void test() {
        Assert.assertEquals(
            3L,
            (long) this.alg.maxDepth(this.node)
        );
    }
}
