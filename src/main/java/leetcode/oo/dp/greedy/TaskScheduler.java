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
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(value -> (int) value).reversed());
        queue.addAll(cnt.values());
        int interval = 0;
        while (!queue.isEmpty()) {
            final List<Integer> temp = new ArrayList<>();
            for (int i = 0; i <= limit; i++) {
                if (!queue.isEmpty()) {
                    final Integer poll = queue.poll();
                    if (poll - 1 > 0) {
                        temp.add(poll - 1);
                    }
                }
                interval++;
                if(temp.isEmpty() && queue.isEmpty()){
                    return interval;
                }
            }
            queue.addAll(temp);
        }
        return interval;
    }
}
