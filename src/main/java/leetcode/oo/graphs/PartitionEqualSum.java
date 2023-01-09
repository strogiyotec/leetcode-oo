package leetcode.oo.graphs;

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
        final Search search = new Search() {
            @Override
            public boolean dfs(
                final boolean[] visited,
                final int[] nums,
                final int parts,
                final int index,
                final int currentSum
            ) {
                if (parts == 0) {
                    return true;
                }
                if (currentSum == sumPerPart) {
                    return this.dfs(visited, nums, parts - 1, 0, 0);
                }
                if (index >= nums.length || currentSum > sumPerPart) {
                    return false;
                }
                for (int i = index; i < nums.length; i++) {
                    if (!visited[i]) {
                        visited[i] = true;
                        if (this.dfs(visited, nums, parts, i + 1, currentSum + nums[i])){
                            return true;
                        }
                        visited[i]= false;
                    }
                }
                return false;
            }
        };

        return search.dfs(visited, nums, k, 0, 0);
    }

    interface Search {
        boolean dfs(boolean[] visited, int[] nums, int parts, int index, int currentSum);
    }

}
