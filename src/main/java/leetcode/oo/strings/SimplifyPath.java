package leetcode.oo.strings;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/simplify-path/
final class SimplifyPath {

    String simplifyPath(final String path) {
        final Deque<String> queue = new ArrayDeque<>();
        final String[] split = path.split("/");
        for (final String part : split) {
            if ("..".equals(part)) {
                if (!queue.isEmpty()) {
                    queue.pollLast();
                }
            } else if (!part.isEmpty() && !".".equals(part)) {
                queue.add(part);
            }
        }
        final StringBuilder builder = new StringBuilder();
        for (final String part : queue) {
            builder.append('/').append(part);
        }
        if (builder.length() == 0) {
            builder.append('/');
        }
        return builder.toString();
    }
}
