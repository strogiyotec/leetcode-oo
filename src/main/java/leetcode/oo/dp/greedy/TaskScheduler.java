package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Task scheduler.
 * See {@link <a href ="https://leetcode.com/problems/task-scheduler/">https://leetcode.com/problems/task-scheduler/</a>}
 */
final class TaskScheduler {

    int leastInterval(final char[] tasks, final int limit) {
        final Map<Character, Integer> cnt = new HashMap<>(tasks.length);
        for (final char task : tasks) {
            cnt.merge(task, 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue.addAll(cnt.values());
        int cycles = 0;
        while (!queue.isEmpty()) {
            final List<Integer> temp = new ArrayList<>(queue.size());
            int i = 0;
            while (!queue.isEmpty() && i <= limit) {
                final Integer poll = queue.poll();
                i++;
                cycles++;
                if (poll - 1 > 0) {
                    temp.add(poll - 1);
                }
            }
            // if we are out of letters then fill idles
            if (i <= limit && !temp.isEmpty()) {
                cycles += limit - i + 1;
            }
            temp.forEach(queue::offer);
        }
        return cycles;
    }
}
