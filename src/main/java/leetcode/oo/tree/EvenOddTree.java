package leetcode.oo.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/even-odd-tree/
public final class EvenOddTree {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(10);
        tree.right = new PlainTree(4);
        tree.left.left = new PlainTree(3);
        tree.right.left = new PlainTree(7);
        tree.right.right = new PlainTree(9);
        tree.left.left.left = new PlainTree(12);
        tree.left.left.right = new PlainTree(8);
        tree.right.left.left = new PlainTree(6);
        tree.right.right.right = new PlainTree(2);
        System.out.println(new EvenOddTree().isEvenOddTree(tree));
    }

    public boolean isEvenOddTree(PlainTree root) {
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        int index = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            Integer prev = null;
            if (index % 2 == 0) {
                for (int i = 0; i < size; i++) {
                    final PlainTree node = queue.poll();
                    if (node.val % 2 == 0) {
                        return false;
                    }
                    if (prev != null) {
                        if (node.val <= prev) {
                            return false;
                        }
                    }
                    prev = node.val;
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            } else {
                for (int i = 0; i < size; i++) {
                    final PlainTree node = queue.poll();
                    if (node.val % 2 != 0) {
                        return false;
                    }
                    if (prev != null) {
                        if (prev <= node.val) {
                            return false;
                        }
                    }
                    prev = node.val;
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            index++;
        }
        return true;
    }
}
