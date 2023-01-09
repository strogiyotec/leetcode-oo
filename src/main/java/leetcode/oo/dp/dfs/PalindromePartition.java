package leetcode.oo.dp.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/palindrome-partitioning/
final class PalindromePartition {

    List<List<String>> partition(final String word) {
        final List<List<String>> solution = new ArrayList<>();
        this.dfs(word, solution, 0, new LinkedList<>());
        return solution;
    }

    private void dfs(final String word, final List<List<String>> solution, final int index, final LinkedList<String> current) {
        if (index >= word.length()) {
            solution.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i <= word.length(); i++) {
            final String sub = word.substring(index, i);
            if (!sub.isEmpty() && this.palindrome(sub)) {
                current.add(sub);
                this.dfs(word,solution,i,current);
                current.removeLast();
            }
        }
    }

    private boolean palindrome(final String sub) {
        int left = 0;
        int right = sub.length() - 1;
        while (left <= right) {
            if (sub.charAt(left++) != sub.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}
