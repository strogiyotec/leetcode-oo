package leetcode.oo.dp.backtracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/restore-ip-addresses/
final class RestoreIpAddress {

    List<String> restoreIpAddresses(final String word) {
        final List<String> solution = new ArrayList<>();
        this.dfs(solution, word, 0, "");
        return solution;
    }

    private void dfs(final List<String> solution, final String word, final int dots, final String remaining) {
        if (dots == 4) {
            if (word.isEmpty()) {
                solution.add(remaining);
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (word.length() < i) {
                continue;
            }
            final Integer sub = Integer.parseInt(word.substring(0, i));
            if (sub <= 255 && String.valueOf(sub).length() == i) {
                if (dots < 3) {
                    this.dfs(solution, word.substring(i), dots + 1, remaining + sub + ".");
                } else {
                    this.dfs(solution, word.substring(i), dots + 1, remaining + sub);
                }
            }
        }
    }
}
