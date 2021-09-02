package leetcode.oo.dp;

import java.util.stream.IntStream;

//https://leetcode.com/problems/predict-the-winner/
final class PredictWinner {

    boolean PredictTheWinner(int[] nums) {
        final int sum = IntStream.of(nums).sum();
        final int firstScore = this.dfs(nums, 0, nums.length-1);
        return firstScore >= sum-firstScore;
    }

    private int dfs(final int[] nums, final int left, final int right) {
        if (left == right) {
            return nums[left];
        }
        if (left > right || right<0) {
            return 0;
        }
        int fromLeft = nums[left] + Math.min(
            this.dfs(nums, left + 2, right),
            this.dfs(nums, left + 1, right - 1)
        );
        int fromRight = nums[right] + Math.min(
            this.dfs(nums, left, right - 2),
            this.dfs(nums,left + 1, right - 1)
        );
        return Math.max(
            fromRight,
            fromLeft
        );
    }

}
