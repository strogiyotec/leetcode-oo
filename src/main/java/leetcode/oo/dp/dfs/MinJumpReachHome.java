package leetcode.oo.dp.dfs;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/minimum-jumps-to-reach-home/
final class MinJumpReachHome {

    int minimumJumps(final int[] forbidden, final int forwardSteps, final int backwardSteps, final int destination) {
        final Queue<AbstractMap.SimpleEntry<Boolean, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(false, 0));
        final Set<AbstractMap.SimpleEntry<Boolean, Integer>> visited = new HashSet<>(forbidden.length << 1);
        int max = forwardSteps + backwardSteps + destination;
        for (final int position : forbidden) {
            visited.add(new AbstractMap.SimpleEntry<>(false, position));
            visited.add(new AbstractMap.SimpleEntry<>(true, position));
            max = Math.max(forwardSteps + backwardSteps + position, max);
        }
        int steps = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final AbstractMap.SimpleEntry<Boolean, Integer> poll = queue.poll();
                if (poll.getValue().equals(destination)) {
                    return steps;
                }
                final AbstractMap.SimpleEntry<Boolean, Integer> forward = new AbstractMap.SimpleEntry<>(true, poll.getValue() + forwardSteps);
                final AbstractMap.SimpleEntry<Boolean, Integer> backward = new AbstractMap.SimpleEntry<>(false, poll.getValue() - backwardSteps);
                if (forward.getValue() <= max && !visited.contains(forward)) {
                    visited.add(forward);
                    queue.add(forward);
                }
                //can't jump back twise
                if (this.isForward(poll) && backward.getValue() >= 0 && !visited.contains(backward)) {
                    visited.add(backward);
                    queue.add(backward);
                }
            }
            steps++;
        }
        return -1;
    }

    private boolean isForward(final AbstractMap.SimpleEntry<Boolean, Integer> entry) {
        return entry.getKey();
    }
}
