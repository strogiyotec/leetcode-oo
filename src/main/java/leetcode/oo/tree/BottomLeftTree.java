package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public final class BottomLeftTree {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(2);
        tree.left = new PlainTree(1);
        tree.right =new PlainTree(3);
        System.out.println(new BottomLeftTree().findBottomLeftValue(tree));
    }
    public int findBottomLeftValue( PlainTree root) {
        final Queue<PlainTree> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                if (root.right != null) {
                    queue.add(root.right);
                }
                if (root.left != null) {
                    queue.add(root.left);
                }
            }
        }
        return root.val;
    }
}
