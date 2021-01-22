package leetcode.oo.dp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/remove-invalid-parentheses/
final class RemoveInvalidParentheses {

    List<String> removeInvalidParentheses(String s) {
        final List<String> solution = new ArrayList<>(16);
        final Set<String> cache = new HashSet<>(16);
        final Queue<String> queue = new ArrayDeque<>();
        queue.add(s);
        cache.add(s);
        boolean found = false;
        while (!queue.isEmpty()) {
            final String poll = queue.poll();
            if (this.isValid(poll)) {
                solution.add(poll);
                found = true;
            }
            //we need only min
            if (!found) {
                for (int i = 0; i < poll.length(); i++) {
                    if (poll.charAt(i) != '(' && poll.charAt(i) != ')') {
                        continue;
                    }
                    final String withRemoved = poll.substring(0, i) + poll.substring(i + 1);
                    if (!cache.contains(withRemoved)) {
                        cache.add(withRemoved);
                        queue.offer(withRemoved);
                    }
                }
            }
        }
        return solution;
    }

    // helper function checks if string s contains valid parantheses
    private boolean isValid(final String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '(') count++;
            if (c == ')' && count-- == 0) return false;
        }
        return count == 0;
    }
}
