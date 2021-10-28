package leetcode.amazon;

import java.util.Stack;

//https://leetcode.com/problems/next-greater-element-ii/
final class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {
        final Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            stack.push(i);
        }
        final int[] nextGreater = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = nums[stack.peek()];
            }
            stack.push(i);
        }
        return nextGreater;
    }

}
