package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//https://leetcode.com/problems/ones-and-zeroes/
final class OnesAndZeroes {

    int findMaxForm(String[] strs, int m, int n) {
        int[][] sums = new int[strs.length][2];
        for (int i = 0; i < strs.length; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) == '1') {
                    ones++;
                } else {
                    zeros++;
                }
            }
            sums[i] = new int[]{zeros, ones};
        }
        final Map<Triplet, Integer> cache = new HashMap<>();
        return this.dfs(sums, m, n, 0, cache);
    }

    private int dfs(final int[][] sums, final int zeros, final int ones, final int index, final Map<Triplet, Integer> cache) {
        if (ones < 0 || zeros < 0 || index >= sums.length) {
            return 0;
        }
        final Triplet triplet = new Triplet(zeros, ones, index);
        if (cache.containsKey(triplet)) {
            return cache.get(triplet);
        }
        final int[] currentSum = sums[index];
        int include = 0;
        if (zeros >= currentSum[0] && ones >= currentSum[1]) {
            include = 1 + this.dfs(sums, zeros - currentSum[0], ones - currentSum[1], index + 1, cache);
        }
        final int notInclude = this.dfs(sums, zeros, ones, index + 1, cache);
        final int max = Math.max(notInclude, include);
        cache.put(triplet, max);
        return max;
    }

    static class Triplet {
        int first, second, third;

        public Triplet(final int first, final int second, final int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof OnesAndZeroes.Triplet)) return false;
            final OnesAndZeroes.Triplet triplet = (OnesAndZeroes.Triplet) o;
            return this.first == triplet.first && this.second == triplet.second && this.third == triplet.third;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.first, this.second, this.third);
        }
    }

}
