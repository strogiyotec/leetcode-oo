package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/**
 * Maximum Depth of N-ary Tree.
 * See {@link <a href ="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/">https://leetcode.com/problems/maximum-depth-of-n-ary-tree/</a>}
 */
final class MaxDepthNTree {

    @SuppressWarnings("ALL")
    int maxDepth(final Node root) {
        int depth = 0;
        final Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Node poll = queue.poll();
                if (poll.children != null && !poll.children.isEmpty()) {
                    for (final Node child : poll.children) {
                        queue.offer(child);
                    }
                }
            }
            depth++;
        }
        return depth;
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
