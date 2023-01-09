package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/restore-ip-addresses/
final class RestoreIpAddress {

    List<String> restoreIpAddresses(final String word) {
        final List<String> solution = new ArrayList<>();
        this.dfs(solution, 0, word, "");
        return solution;
    }

    private void dfs(final List<String> solution, final int dots, final String word, final String accumulative) {
        if (dots == 4) {
            if (word.isEmpty()) {
                solution.add(accumulative);
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (word.length() < i) {
                return;
            }
            final String sub = word.substring(0, i);
            final Integer parsed = Integer.parseInt(sub);
            if (parsed <= 255 && sub.length() == String.valueOf(parsed).length()) {
                if (dots < 3) {
                    this.dfs(solution, dots + 1, word.substring(i), accumulative + sub + ".");
                } else {
                    this.dfs(solution, dots + 1, word.substring(i), accumulative + sub);
                }
            }
        }
    }

}
