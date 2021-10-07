package leetcode.oo.dp.dfs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/open-the-lock/
public final class OpenLock {

    public static void main(String[] args) {
        System.out.println(new OpenLock().openLock(
            new String[]{
                "8888"
            },
            "0009"
        ));
    }

    public int openLock(String[] deadends, String target) {
        final Set<String> blocked = new HashSet<>(Arrays.asList(deadends));
        final String start = "0000";
        final Set<String> visited = new HashSet<>(deadends.length << 1);
        final Queue<String> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        int steps = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final String next = queue.poll();
                if(blocked.contains(next)){
                    continue;
                }
                if (next.equals(target)) {
                    return steps;
                }
                for (int index = 0; index < 4; index++) {
                    final char c = next.charAt(index);
                    boolean isLast = c == '9';
                    final boolean isFirst = c == '0';
                    final String forward;
                    final String backward;
                    if (isLast) {
                        forward = next.substring(0, index) + '0' + next.substring(index + 1);
                    } else {
                        forward = next.substring(0, index) + (Character.getNumericValue(c) + 1) + next.substring(index + 1);
                    }
                    if (isFirst) {
                        backward = next.substring(0, index) + '9' + next.substring(index + 1);
                    } else {
                        backward = next.substring(0, index) + (Character.getNumericValue(c) - 1) + next.substring(index + 1);
                    }
                    if (!visited.contains(backward) && !blocked.contains(backward)) {
                        queue.offer(backward);
                        visited.add(backward);
                    }
                    if (!visited.contains(forward) && !blocked.contains(forward)) {
                        queue.offer(forward);
                        visited.add(forward);
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
