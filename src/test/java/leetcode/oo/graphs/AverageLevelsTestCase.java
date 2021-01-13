package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.List;
import leetcode.oo.tree.PlainTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class AverageLevelsTestCase {

    private AverageLevels alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new AverageLevels();
    }

    @Test
    public void test(){
        final PlainTree tree = new PlainTree(3);
        tree.left = new PlainTree(9);
        tree.right = new PlainTree(20);
        tree.right.right = new PlainTree(7);
        tree.right.left = new PlainTree(15);
        final List<Double> list = this.alg.averageOfLevels(tree);
        Assert.assertEquals(
            Arrays.asList(3.0,14.5,11.0),
            list
        );
    }
}
