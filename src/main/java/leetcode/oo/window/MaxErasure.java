package leetcode.oo.window;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/maximum-erasure-value/
public final class MaxErasure {

    public static void main(String[] args) {
        System.out.println(new MaxErasure().maximumUniqueSubarray(
            new int[]{4,2,4,5,6}
        ));
    }

    public int maximumUniqueSubarray(final int[] nums) {
        final Set<Integer> unique = new HashSet<>(nums.length);
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSum = 0;
        while (right < nums.length) {
            while (unique.contains(nums[right])) {
                sum -= nums[left];
                unique.remove(nums[left]);
                left++;
            }
            sum += nums[right];
            maxSum = Math.max(sum, maxSum);
            unique.add(nums[right]);
            right++;
        }
        return maxSum;
    }
}
