package leetcode.oo.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/remove-invalid-parentheses/
final class RemoveInvalidParentheses {

    List<String> removeInvalidParentheses(String s) {
        final List<String> solution = new ArrayList<>();
        final Set<String> cache = new HashSet<>();
        final Queue<String> queue = new LinkedList<>();
        queue.add(s);
        boolean found = false;
        while (!queue.isEmpty()) {
            final String poll = queue.poll();
            if (this.isValid(poll)) {
                found = true;
                solution.add(poll);
            }
            if (!found) {
                for (int i = 0; i < poll.length(); i++) {
                    if (poll.charAt(i) == '(' || poll.charAt(i) == ')') {
                        final String sub = poll.substring(0, i) + poll.substring(i + 1);
                        if (cache.add(sub)) {
                            queue.add(sub);
                        }
                    }
                }
            }
        }
        return solution;
    }

    // helper function checks if string s contains valid parantheses
    private boolean isValid(final String line) {
        int cnt = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
                if (cnt < 0) {
                    return false;
                }
            }
        }
        return cnt == 0;
    }
}
