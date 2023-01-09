package leetcode.oo.dp;

import java.util.stream.IntStream;

//https://leetcode.com/problems/predict-the-winner/
final class PredictWinner {

    boolean PredictTheWinner(int[] nums) {
        final int sum = IntStream.of(nums).sum();
        final int firstScore = this.dfs(nums, 0, nums.length - 1);
        return firstScore >= sum - firstScore;
    }

    private int dfs(final int[] nums, final int left, final int right) {
        if (left > right) {
            return 0;
        }
        if (left == right) {
            return nums[right];
        }
        final int leftSum = nums[left] + Math.min(
            this.dfs(nums, left + 2, right),
            this.dfs(nums, left + 1, right - 1)
        );
        final int rightSum = nums[right] + Math.min(
            this.dfs(nums, left, right - 2),
            this.dfs(nums, left + 1, right - 1)
        );
        return Math.max(rightSum,leftSum);
    }

}
