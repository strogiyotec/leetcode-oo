package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
final class PopulateNextRight {

    PopulateNextRight.Node connect(final PopulateNextRight.Node root) {
        Queue<PopulateNextRight.Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            PopulateNextRight.Node prev = queue.poll();
            final Queue<PopulateNextRight.Node> temp = new ArrayDeque<>();
            for (int i = 0; i < size && prev != null; i++) {
                final PopulateNextRight.Node next = queue.poll();
                if (next != null) {
                    prev.next = next;
                    if (prev.left != null) {
                        temp.add(prev.left);
                    }
                    if (prev.right != null) {
                        temp.add(prev.right);
                    }
                } else {
                    prev.next = null;
                    if (prev.left != null) {
                        temp.add(prev.left);
                    }
                    if (prev.right != null) {
                        temp.add(prev.right);
                    }
                }
                prev = next;
            }
            queue = temp;
        }
        return root;
    }

    @SuppressWarnings("ALL")
    static class Node {
        public int val;
        public PopulateNextRight.Node left;
        public PopulateNextRight.Node right;
        public PopulateNextRight.Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, PopulateNextRight.Node _left, PopulateNextRight.Node _right, PopulateNextRight.Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

    ;
}
