package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/3sum-closest/
final class ThreeSumClosest {

    int threeSumClosest(final int[] nums, final int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[nums.length - 1] + nums[nums.length - 2];
        for (int i = 0; i < nums.length - 1; i++) {
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;
            while (leftIndex < rightIndex) {
                final int currentSum = nums[i] + nums[leftIndex] + nums[rightIndex];
                if (currentSum > target) {
                    rightIndex--;
                } else {
                    leftIndex++;
                }
                if (Math.abs(target - currentSum) < Math.abs(target - result)) {
                    result = currentSum;
                }
            }
        }
        return result;
    }
}
