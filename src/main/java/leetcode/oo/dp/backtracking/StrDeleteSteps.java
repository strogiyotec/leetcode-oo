package leetcode.oo.dp.backtracking;


/**
 * Delete Operation for Two Strings.
 * See {@link <a href ="https://leetcode.com/problems/delete-operation-for-two-strings/">https://leetcode.com/problems/delete-operation-for-two-strings/</a>}
 */
final class StrDeleteSteps {

    int minDistance(final String first, final String second) {
        return first.length() + second.length() - 2 * new LCS().longestCommonSubsequence(first, second);
    }
}
