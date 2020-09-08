package leetcode.oo.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public final class CloneGraphTestCase {

    private CloneGraph alg;

    /**
     * Init.
     */
    @Before
    public void init(){
        this.alg = new CloneGraph();
    }

    @Test
    public void test(){
        final CloneGraph.Node graph = this.graph();
        final CloneGraph.Node clone = this.alg.cloneGraph(graph);
        for (int i = 0; i < graph.neighbors.size(); i++) {
            Assert.assertEquals(graph.neighbors.get(i).val,clone.neighbors.get(i).val);
        }
    }

    private CloneGraph.Node graph(){
        final CloneGraph.Node first = new CloneGraph.Node(1);
        final CloneGraph.Node second = new CloneGraph.Node(2);
        final CloneGraph.Node third = new CloneGraph.Node(3);
        final CloneGraph.Node fourth = new CloneGraph.Node(4);
        first.neighbors.add(second);
        first.neighbors.add(fourth);

        second.neighbors.add(first);
        second.neighbors.add(third);


        third.neighbors.add(second);
        third.neighbors.add(fourth);

        fourth.neighbors.add(first);
        fourth.neighbors.add(third);

        return first;
    }
}
