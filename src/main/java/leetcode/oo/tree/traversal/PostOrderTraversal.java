package leetcode.oo.tree.traversal;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/
final class PostOrderTraversal {

    List<Integer> postorder(Node root) {
        final List<Integer> solution = new ArrayList<>();
        this.traverse(root, solution);
        return solution;
    }

    private void traverse(final Node node, final List<Integer> list) {
        if (node != null) {
            if (node.children != null) {
                for (final Node child : node.children) {
                    this.traverse(child, list);
                }
            }
            list.add(node.val);

        }
    }

    static class Node {
        public int val;
        public List<PostOrderTraversal.Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<PostOrderTraversal.Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
