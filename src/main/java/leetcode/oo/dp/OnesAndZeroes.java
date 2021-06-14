package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//https://leetcode.com/problems/ones-and-zeroes/
final class OnesAndZeroes {

    int findMaxForm(String[] strs, int m, int n) {
        final int[][] sum = new int[strs.length][2];
        for (int i = 0; i < strs.length; i++) {
            final String word = strs[i];
            int ones = 0;
            int zeros = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '1') {
                    ones++;
                } else {
                    zeros++;
                }
            }
            sum[i] = new int[]{zeros, ones};
        }
        final Map<Triplet, Integer> set = new HashMap<>(strs.length);
        return this.dfs(m, n, sum, 0, set);
    }

    private int dfs(final int m, final int n, final int[][] sum, final int index, final Map<Triplet, Integer> map) {
        if (index == sum.length || m < 0 || n < 0) {
            return 0;
        }
        final Triplet triplet = new Triplet(m, n, index);
        if (map.containsKey(triplet)) {
            return map.get(triplet);
        }
        final int[] current = sum[index];
        int includeCnt = 0;
        if (current[0] <= m && current[1] <= n) {
            includeCnt = 1 + this.dfs(m - current[0], n - current[1], sum, index + 1, map);
        }
        final int nonInclude = this.dfs(m, n, sum, index + 1, map);
        map.put(triplet, Math.max(includeCnt, nonInclude));
        return Math.max(includeCnt, nonInclude);
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
