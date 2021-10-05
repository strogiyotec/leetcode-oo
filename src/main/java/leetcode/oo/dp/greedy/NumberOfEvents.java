package leetcode.oo.dp.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/
public final class NumberOfEvents {

    public int maxEvents(int[][] events) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>();
        Arrays.sort(events, Comparator.comparingInt(value -> value[0]));
        int eventCnt = 0;
        int day = 1;
        int index = 0;
        while (index < events.length || !queue.isEmpty()) {
            while (!queue.isEmpty() && queue.peek() < day) {
                queue.poll();
            }
            while (index < events.length && events[index][0] == day) {
                queue.offer(events[index][1]);
                index++;
            }
            if (!queue.isEmpty()) {
                queue.poll();
                eventCnt++;
            }
            day++;
        }
        return eventCnt;
    }
}
