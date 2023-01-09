package leetcode.oo.dp.dfs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/minimum-jumps-to-reach-home/
final class MinJumpReachHome {

    int minimumJumps(final int[] forbidden, final int forwardSteps, final int backwardSteps, final int destination) {
        final Queue<Jump> queue = new LinkedList<>();
        queue.add(new Jump(false, 0));
        final Set<Jump> visited = new HashSet<>(forbidden.length << 1);
        int max = forwardSteps + backwardSteps + destination;
        for (final int position : forbidden) {
            visited.add(new Jump(false, position));
            visited.add(new Jump(true, position));
            max = Math.max(forwardSteps + backwardSteps + position, max);
        }
        int steps = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Jump jump = queue.poll();
                if (jump.position == destination) {
                    return steps;
                }
                final Jump forward = new Jump(true, jump.position + forwardSteps);
                final Jump backward = new Jump(false, jump.position - backwardSteps);
                if (forward.position <= max && !visited.contains(forward)) {
                    visited.add(forward);
                    queue.add(forward);
                }
                if (jump.forward && backward.position > 0 && !visited.contains(backward)) {
                    visited.add(backward);
                    queue.add(backward);
                }
            }
            steps++;
        }
        return -1;
    }

    private static class Jump {

        final boolean forward;

        final int position;

        private Jump(final boolean forward, final int steps) {
            this.forward = forward;
            this.position = steps;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            final MinJumpReachHome.Jump jump = (MinJumpReachHome.Jump) o;
            return this.forward == jump.forward && this.position == jump.position;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.forward, this.position);
        }
    }

}
