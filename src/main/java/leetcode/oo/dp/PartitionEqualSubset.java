package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Partition Equal Subset Sum.
 * See {@link <a href ="https://leetcode.com/problems/partition-equal-subset-sum/">https://leetcode.com/problems/partition-equal-subset-sum/</a>}
 */
final class PartitionEqualSubset {

    boolean canPartition(final int[] nums) {
        int total = IntStream.of(nums).sum();
        if (total % 2 != 0) {
            return false;
        }
        total /= 2;
        final Map<String, Boolean> memo = new HashMap<>(nums.length);
        return this.bfs(nums, 0, 0, total, memo);
    }

    private boolean bfs(final int[] nums, final int index, final int sum, final int total, final Map<String, Boolean> memo) {
        final String line = String.format("%d%d", index, sum);
        if (memo.containsKey(line)) {
            return memo.get(line);
        }
        if (sum == total) {
            return true;
        }
        if (sum > total || index > nums.length) {
            return false;
        }
        final boolean found = this.bfs(nums, index + 1, sum + nums[index], total, memo)
            || this.bfs(nums, index + 1, sum, total, memo);
        memo.put(line, found);
        return found;
    }
}
