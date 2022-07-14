package leetcode.oo.dp.dfs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/
public final class ValidParenthesisStringPath {

    public static void main(String[] args) {
        System.out.println(new ValidParenthesisStringPath().hasValidPath(
            new char[][]{
                {'(', '(', '('},
                {')', '(', ')'},
                {'(', '(', ')'},
                {'(', '(', ')'}
            }
        ));
    }

    public boolean hasValidPath(char[][] grid) {
        return this.dfs(grid, 0, 0,0, new HashSet<>());
    }

    private boolean dfs(final char[][] grid, final int row, final int col, int count, final Set<Triplet> cache) {
        count += grid[row][col] == '(' ? 1 : -1;
        if (count < 0 || count + row + col >= grid.length + grid[0].length - 1 || cache.contains(new Triplet(row, col, count))) {
            return false;
        }
        if (row == grid.length - 1 && col == grid[0].length - 1 && count == 0) {
            return true;
        }
        cache.add(new Triplet(row, col, count));
        if (row + 1 < grid.length && this.dfs(grid, row + 1, col, count, cache)) {
            return true;
        }
        return col + 1 < grid[0].length && this.dfs(grid, row, col + 1, count, cache);
    }

    private static class Triplet {
        private final int first, second, third;

        private Triplet(final int first, final int second, final int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            final Triplet triplet = (Triplet) o;
            return this.first == triplet.first && this.second == triplet.second && this.third == triplet.third;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.first, this.second, this.third);
        }
    }
}
