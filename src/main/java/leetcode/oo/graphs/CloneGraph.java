package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Clone graph.
 * See {@link <a href ="https://leetcode.com/problems/clone-graph/">https://leetcode.com/problems/clone-graph/</a>}
 */
final class CloneGraph {

    Node cloneGraph(final Node node) {
        if (node == null) {
            return null;
        }
        final Map<Integer, Node> map = new HashMap<>();
        return this.dfs(node, map);
    }

    private Node dfs(final Node node, final Map<Integer, Node> map) {
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }
        final Node copy = new Node(node.val);
        map.put(node.val, copy);
        node.neighbors.forEach(neighbor -> copy.neighbors.add(this.dfs(neighbor, map)));
        return copy;
    }

    static class Node {
        int val;
        List<Node> neighbors;

        Node(int val) {
            this.val = val;
            neighbors = new ArrayList<>();
        }
    }
}
