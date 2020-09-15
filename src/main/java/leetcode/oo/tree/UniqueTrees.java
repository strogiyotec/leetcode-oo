package leetcode.oo.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *Unique BST.
 * See {@link <a href ="https://leetcode.com/problems/unique-binary-search-trees/">https://leetcode.com/problems/unique-binary-search-trees/</a>}
 */
final class UniqueTrees {

    int numTrees(final int number) {
        final Map<IntPair, Integer> map = new HashMap<>();
        return this.calculate(1, number, number, map);
    }

    private int calculate(final int start, final int end, final int limit, final Map<IntPair, Integer> map) {
        if (start < 0 || end > limit || start >= end) {
            return 1;
        }
        final IntPair pair = new IntPair(start, end);
        if (map.containsKey(pair)) {
            return map.get(pair);
        } else {
            int cnt = 0;
            for (int i = start; i <= end; i++) {
                int left = this.calculate(start, i - 1, limit, map);
                int right = this.calculate(i + 1, end, limit, map);
                cnt += left * right;
            }
            map.put(new IntPair(start, end), cnt);
            return cnt;
        }
    }

    static class IntPair {
        final int first;
        final int second;

        public IntPair(final int first, final int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "IntPair{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final IntPair intPair = (IntPair) o;
            return first == intPair.first &&
                    second == intPair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
