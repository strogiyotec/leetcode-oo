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
        for (final char task : tasks) {
            cnt.merge(task, 1, Integer::sum);
        }
        final PriorityQueue<Character> queue = new PriorityQueue<>(Comparator.<Character>comparingInt(cnt::get).reversed());
        queue.addAll(cnt.keySet());
        int tasksCnt = 0;
        while (!queue.isEmpty()) {
            final List<Character> next = new ArrayList<>();
            for (int i = 0; i <= limit; i++) {
                if (queue.isEmpty()) {
                    if (next.isEmpty()) {
                        return tasksCnt;
                    } else {
                        tasksCnt += limit - i + 1;
                        break;
                    }
                }
                tasksCnt++;
                final Character highest = queue.poll();
                if (cnt.computeIfPresent(highest, (character, value) -> value - 1) == 0) {
                    cnt.remove(highest);
                } else {
                    next.add(highest);
                }
            }
            queue.addAll(next);
        }
        return tasksCnt;
    }
}
