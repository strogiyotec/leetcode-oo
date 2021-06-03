package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
final class FromPreAndIn {

    TreeNode buildTree(final int[] preorder, final int[] inorder) {
        final Queue<Integer> queue = new ArrayDeque<>(preorder.length + 1);
        for (final int number : preorder) {
            queue.add(number);
        }
        final Map<Integer, Integer> numToIdx = new HashMap<>(inorder.length + 2);
        for (int i = 0; i < inorder.length; i++) {
            numToIdx.put(inorder[i], i);
        }
        return this.tree(queue, numToIdx, 0, preorder.length - 1);
    }

    private TreeNode tree(final Queue<Integer> queue, final Map<Integer, Integer> numToIdx, final int left, final int right) {
        if (left < 0 || left > right) {
            return null;
        }
        final TreeNode tree = new TreeNode(queue.poll());
        final int middleIndex = numToIdx.get(tree.val);
        tree.left = this.tree(queue, numToIdx, left, middleIndex - 1);
        tree.right = this.tree(queue, numToIdx, middleIndex + 1, right);
        return tree;
    }

    @SuppressWarnings("ALL")
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
