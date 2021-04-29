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
        final Map<Character, Integer> map = new HashMap<>(tasks.length);
        for (int i = 0; i < tasks.length; i++) {
            map.merge(tasks[i], 1, Integer::sum);
        }
        final PriorityQueue<Character> queue = new PriorityQueue<>((o1, o2) -> map.get(o2) - map.get(o1));
        queue.addAll(map.keySet());
        int answer = 0;
        while (!queue.isEmpty()) {
            final List<Character> temp = new ArrayList<>();
            for (int i = 0; i <= limit; i++) {
                if (queue.isEmpty() && temp.isEmpty()) {
                    return answer;
                }
                if (queue.isEmpty()) {
                    answer += limit - i+1;
                    break;
                }
                final Character character = queue.poll();
                if (map.computeIfPresent(character, (key, oldValue) -> oldValue - 1) != 0) {
                    temp.add(character);
                }
                answer++;
            }
            queue.addAll(temp);
        }
        return answer;
    }
}
