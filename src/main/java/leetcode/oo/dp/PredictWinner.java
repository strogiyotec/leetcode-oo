package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//https://leetcode.com/problems/predict-the-winner/
final class PredictWinner {

    boolean PredictTheWinner(int[] nums) {
        final Map<Pair, Integer> cache = new HashMap<>(nums.length);
        return this.dfs(nums, 0, nums.length - 1, cache) >= 0;
    }

    private int dfs(final int[] nums, final int left, final int right, final Map<Pair, Integer> cache) {
        if (left == right) {
            return nums[left];
        }
        if (left > right) {
            return 0;
        }
        final int fromLeft = nums[left] - this.dfs(nums, left + 1, right, cache);
        final int fromRight = nums[right] - this.dfs(nums, left, right - 1, cache);
        return Math.max(
            fromLeft,
            fromRight
        );
    }

    private static class Pair {
        final int left;
        final int right;

        private Pair(final int left, final int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || !this.getClass().equals(o.getClass()))
                return false;
            final Pair pair = (Pair) o;
            return this.left == pair.left && this.right == pair.right;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.left, this.right);
        }
    }

}
