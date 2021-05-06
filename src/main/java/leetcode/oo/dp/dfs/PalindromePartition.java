package leetcode.oo.dp.dfs;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/palindrome-partitioning/
final class PalindromePartition {

    List<List<String>> partition(final String word) {
        final List<List<String>> solution = new ArrayList<>();
        this.dfs(0, solution, new ArrayList<>(), word);
        return solution;
    }

    void dfs(final int index, final List<List<String>> solution, final List<String> current, final String word) {
        if (index >= word.length()) {
            if (!current.isEmpty()) {
                solution.add(new ArrayList<>(current));
            }
            return;
        }
        for (int i = index; i < word.length(); i++) {
            final String sub = word.substring(index, i + 1);
            if (this.palindrom(sub)) {
                current.add(sub);
                this.dfs(i + 1, solution, current, word);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean palindrom(final String sub) {
        int left = 0;
        int right = sub.length() - 1;
        while (left <= right) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
