package leetcode.oo.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/n-ary-tree-level-order-traversal/
public final class TreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        final List<List<Integer>> traversal = new LinkedList<>();
        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final List<Integer> current = new LinkedList<>();
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Node poll = queue.poll();
                current.add(poll.val);
                if (poll.children != null) {
                    queue.addAll(poll.children);
                }
            }
            traversal.add(current);
        }
        return traversal;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
