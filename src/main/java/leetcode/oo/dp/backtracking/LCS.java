package leetcode.oo.dp.backtracking;

/**
 * Longest common subsequence.
 * See {@link <a href ="https://leetcode.com/problems/longest-common-subsequence/">https://leetcode.com/problems/longest-common-subsequence/</a>}
 */
final class LCS {

    int longestCommonSubsequence(final String first, final String second) {
        if (first == null || second == null) {
            return 0;
        }
        if (first.isEmpty() || second.isEmpty()) {
            return 0;
        }
        return this.dynamicApproach(first, second);
    }

    private int dynamicApproach(final String first, final String second) {
        final int[][] table = new int[first.length() + 1][second.length() + 1];
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[0].length; j++) {
                if (first.charAt(i - 1) == second.charAt(j - 1)) {
                    table[i][j] = 1 + table[i - 1][j - 1];
                } else {
                    table[i][j] = Math.max(
                            table[i - 1][j],
                            table[i][j - 1]
                    );
                }
            }
        }
        return table[first.length()][second.length()];
    }

    private int recursiveApproach(
            final int firstIndex,
            final int secondIndex,
            final String first,
            final String second
    ) {
        System.out.println(firstIndex + " " + secondIndex);
        if (firstIndex == 0 || secondIndex == 0) {
            return 0;
        }
        if (first.charAt(firstIndex - 1) == second.charAt(secondIndex - 1)) {
            return 1 + this.recursiveApproach(firstIndex - 1, secondIndex - 1, first, second);
        }
        return Math.max(
                this.recursiveApproach(firstIndex - 1, secondIndex, first, second),
                this.recursiveApproach(firstIndex, secondIndex - 1, first, second)
        );
    }
}

