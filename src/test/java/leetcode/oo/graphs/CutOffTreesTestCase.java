package leetcode.oo.graphs;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CutOffTreesTestCase {

    private CutOffTrees alg;

    /**
     * Init.
     */
    @Before
    public void init() {
        this.alg = new CutOffTrees();
    }

    @Test
    public void test() {
        Assert.assertEquals(
            6,
            this.alg.cutOffTree(
                List.of(
                    List.of(1, 2, 3),
                    List.of(0, 0, 4),
                    List.of(7, 6, 5)
                )
            )
        );
    }
}
