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
                final String poll = queue.poll();
                if (poll.equals(target)) {
                    return steps;
                }
                for (int j = 0; j < 4; j++) {
                    final boolean isFirst = poll.charAt(j) == '0';
                    final boolean isLast = poll.charAt(j) == '9';
                    final String forward = this.forward(poll, isLast, j);
                    final String backword = this.backword(poll, isFirst, j);
                    if (!blocked.contains(forward) && !visited.contains(forward)) {
                        visited.add(forward);
                        queue.add(forward);
                    }
                    if (!blocked.contains(backword) && !visited.contains(backword)) {
                        visited.add(backword);
                        queue.add(backword);
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private String backword(final String lock, final boolean isFirst, final int index) {
        if (isFirst) {
            return lock.substring(0, index) + '9' + lock.substring(index + 1);
        } else {
            return lock.substring(0, index) + (Character.getNumericValue(lock.charAt(index)) - 1) + lock.substring(index + 1);
        }
    }

    private String forward(final String lock, final boolean isLast, final int index) {
        if (isLast) {
            return lock.substring(0, index) + '0' + lock.substring(index + 1);
        } else {
            return lock.substring(0, index) + (Character.getNumericValue(lock.charAt(index)) + 1) + lock.substring(index + 1);
        }
    }

}
