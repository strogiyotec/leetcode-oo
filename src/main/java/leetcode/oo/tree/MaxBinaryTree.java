package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/maximum-binary-tree/
public final class MaxBinaryTree {

    public static void main(String[] args) {
        final PlainTree tree = new MaxBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        System.out.println(tree);
        final PlainTree tree2 = new MaxBinaryTree().constructMaximumBinaryTree(new int[]{3, 2, 1});
        System.out.println(tree2);
    }

    public PlainTree constructMaximumBinaryTree(final int[] nums) {
        final Deque<PlainTree> stack = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            final PlainTree tree = new PlainTree(nums[i]);
            while (!stack.isEmpty() && stack.peek().val < tree.val) {
                tree.left = stack.pop();
            }
            if (!stack.isEmpty()) {
                stack.peek().right = tree;
            }
            stack.push(tree);
        }
        if (stack.isEmpty()) {
            return null;
        }
        return stack.removeLast();
    }
}
