package leetcode.oo.stacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Remove duplicate letters.
 * See {@link <a href ="https://leetcode.com/problems/remove-duplicate-letters/">https://leetcode.com/problems/remove-duplicate-letters/</a>}
 */
final class RemoveDuplicateLetters {

    String removeDuplicateLetters(final String line) {
        final Map<Character, Integer> map = new HashMap<>(line.length());
        for (int i = 0; i < line.length(); i++) {
            map.put(line.charAt(i), i);
        }
        final Stack<Character> stack = new Stack<>();
        final Set<Character> visited = new HashSet<>(line.length());
        for (int i = 0; i < line.length(); i++) {
            if (!visited.contains(line.charAt(i))) {
                while (!stack.isEmpty() && stack.peek() > line.charAt(i) && map.get(stack.peek()) > i) {
                    visited.remove(stack.pop());
                }
                visited.add(line.charAt(i));
                stack.push(line.charAt(i));
            }
        }
        final StringBuilder builder = new StringBuilder(stack.size());
        stack.forEach(builder::append);
        return builder.toString();
    }
}
