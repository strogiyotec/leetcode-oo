package leetcode.oo.graphs;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class MinVerticesToReachAllNodesTestCase {

    private MinVerticesToReachAllNodes alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new MinVerticesToReachAllNodes();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            Arrays.asList(0, 3),
            this.alg.findSmallestSetOfVertices(
                6,
                Arrays.asList(
                    Arrays.asList(0, 1),
                    Arrays.asList(0, 2),
                    Arrays.asList(2, 5),
                    Arrays.asList(3, 4),
                    Arrays.asList(4, 2)
                )
            )
        );
    }
}
