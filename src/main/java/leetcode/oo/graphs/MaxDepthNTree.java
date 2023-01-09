package leetcode.oo.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Maximum Depth of N-ary Tree.
 * See {@link <a href ="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/">https://leetcode.com/problems/maximum-depth-of-n-ary-tree/</a>}
 */
final class MaxDepthNTree {

    @SuppressWarnings("ALL")
    int maxDepth(final Node root) {
        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int max = 0;
        while (!queue.isEmpty()) {
            max++;
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Node node = queue.poll();
                if (node.children != null) {
                    for (final Node child : node.children) {
                        queue.add(child);
                    }
                }
            }
        }
        return max;
    }

    @SuppressWarnings("ALL")
    static class Node {
        int val;
        List<Node> children;

        Node() {
        }

        Node(int _val) {
            val = _val;
        }

        Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
