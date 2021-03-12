package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/time-needed-to-inform-all-employees/
public final class NotifyEmployess {

    public static void main(String[] args) {
        System.out.println(new NotifyEmployess().numOfMinutes(
            15,
            0,
            new int[]{-1, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6},
            new int[]{1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}
            )
        );
        System.out.println(new NotifyEmployess().numOfMinutes(
            7, 6, new int[]{1, 2, 3, 4, 5, 6, -1}, new int[]{0, 6, 5, 4, 3, 2, 1}
        ));
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        final Map<Integer, List<Integer>> map = new HashMap<>();  // Build the hierarchical tree
        final Deque<int[]> queue = new LinkedList<>();

        for(int i = 0; i < manager.length; i++) {
            if(!map.containsKey(manager[i])) {
                map.put(manager[i], new ArrayList<>());
            }

            map.get(manager[i]).add(i);     // Map of manager and its subordinates given by the index i
        }

        queue.offer(new int[]{headID, 0});      // head of organizer and corresponding informing time.

        int result = Integer.MIN_VALUE;
        while(!queue.isEmpty()) {
            final int[] temp = queue.poll();
            final int managerAtGivenLevel = temp[0];
            final int cumulativeTime = temp[1];

            result = Math.max(result, cumulativeTime);

            if(map.containsKey(managerAtGivenLevel)) {      // if the manager has subordinates
                final List<Integer> subordinates = map.get(managerAtGivenLevel);  // get the list of subordinates

                for(final int i : subordinates) {
                    queue.offer(new int[]{i, informTime[managerAtGivenLevel] + cumulativeTime});    // add the subordinates as manager and the time taken to inform each of these subordinates
                }
            }
        }
        return result;
    }
}
