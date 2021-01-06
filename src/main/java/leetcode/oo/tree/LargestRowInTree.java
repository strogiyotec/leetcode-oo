package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/
final class LargestRowInTree {

    List<Integer> largestValues(final PlainTree root) {
        final List<Integer> solution = new ArrayList<>(16);
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int max = 0;
            final Queue<PlainTree> temp = new LinkedList<>();
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final PlainTree tree = queue.poll();
                max = Math.max(max, tree.val);
                if (tree.left != null) {
                    temp.offer(tree.left);
                }
                if (tree.right != null) {
                    temp.offer(tree.right);
                }
            }
            solution.add(max);
            queue.addAll(temp);
        }
        return solution;
    }
}
