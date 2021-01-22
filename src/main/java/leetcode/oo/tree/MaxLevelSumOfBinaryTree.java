package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
final class MaxLevelSumOfBinaryTree {

    int maxLevelSum(final PlainTree root) {
        final Queue<PlainTree> queue = new ArrayDeque<>();
        queue.offer(root);
        int max = Integer.MIN_VALUE;
        int maxLevel = 1;
        int level = 1;
        while (!queue.isEmpty()) {
            int sum = 0;
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final PlainTree node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (max < sum) {
                max = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}
