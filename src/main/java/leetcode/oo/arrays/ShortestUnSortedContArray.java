package leetcode.oo.arrays;

import java.util.Stack;

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
final class ShortestUnSortedContArray {

    public int findUnsortedSubarray(final int[] nums) {
        final Stack<Integer> stack = new Stack<>();
        int leftIndex = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                final int index = stack.pop();
                leftIndex = Math.min(leftIndex, index);
                max = Math.max(max, nums[index]);
            }
            stack.push(i);
        }
        if(leftIndex == nums.length){
            return 0;
        }
        int right = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < max) {
                right = i;
                break;
            }
        }
        return right - leftIndex + 1;
    }
}
