package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.Comparator;
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
        final Map<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            cnt.merge(tasks[i], 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(value -> (int) value).reversed());
        queue.addAll(cnt.values());
        int cycles = 0;
        while (!queue.isEmpty()) {
            final List<Integer> list = new ArrayList<>();
            int i = 0;
            while (!queue.isEmpty() && i <= limit) {
                final Integer poll = queue.poll();
                i++;
                cycles++;
                if (poll - 1 > 0) {
                    list.add(poll - 1);
                }
            }
            if (i <= limit && !list.isEmpty()) {
                cycles += limit - i + 1;
            }
            queue.addAll(list);
        }
        return cycles;
    }
}
