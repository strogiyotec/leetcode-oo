package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
final class PartitionEqualSum {

    public boolean canPartitionKSubsets(final int[] nums, final int k) {
        final int sum = IntStream.of(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        final int sumPerPart = sum / k;
        final boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        return this.dfs(k, sumPerPart, visited, nums.length - 1, 0, nums);
    }

    private boolean dfs(final int k, final int sumPerPart, final boolean[] visited, final int index, final int currentSum, final int[] nums) {
        if (k == 0) {
            return true;
        }
        if (currentSum == sumPerPart) {
            return this.dfs(k - 1, sumPerPart, visited, nums.length - 1, 0, nums);
        }
        for (int i = index; i >= 0; i--) {
            if (!visited[i] && nums[i] + currentSum <= sumPerPart) {
                visited[i] = true;
                if (this.dfs(k, sumPerPart, visited, i - 1, currentSum + nums[i], nums)) {
                    return true;
                } else {
                    visited[i] = false;
                }
            }
        }
        return false;
    }

}
