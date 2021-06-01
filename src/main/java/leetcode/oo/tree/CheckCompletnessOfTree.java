package leetcode.oo.tree;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/check-completeness-of-a-binary-tree/
final class CheckCompletnessOfTree {

    boolean isCompleteTree(final PlainTree root) {
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        boolean foundNull = false;
        while (!queue.isEmpty()) {
            final PlainTree node = queue.poll();
            if (node == null) {
                foundNull = true;
            } else {
                if (foundNull) {
                    return false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;
    }
}
