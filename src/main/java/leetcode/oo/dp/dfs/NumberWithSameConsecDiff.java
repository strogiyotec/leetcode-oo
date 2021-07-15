package leetcode.oo.dp.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/numbers-with-same-consecutive-differences/
public final class NumberWithSameConsecDiff {

    public static void main(final String[] args) {
        System.out.println(
            Arrays.toString(
                new NumberWithSameConsecDiff().numsSameConsecDiff(
                    3, 7
                )
            )
        );
    }

    public int[] numsSameConsecDiff(final int n, final int k) {
        final List<Integer> solution = new ArrayList<>();
        this.dfs(n, k, new StringBuilder(k), solution);
        return solution.stream().mapToInt(value -> value).toArray();
    }

    private void dfs(final int length, final int diff, final StringBuilder builder, final List<Integer> solution) {
        if (builder.length() == length) {
            if (builder.charAt(0) != '0') {
                solution.add(Integer.parseInt(builder.toString()));
            }
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (builder.length() == 0 && i == 0) {
                continue;
            }
            if (builder.length() == 0 || Math.abs(Character.getNumericValue(builder.charAt(builder.length() - 1)) - i) == diff) {
                builder.append(i);
                this.dfs(length, diff, builder, solution);
                builder.deleteCharAt(builder.length() - 1);
            }
        }
    }
}
