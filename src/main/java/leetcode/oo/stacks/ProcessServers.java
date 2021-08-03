package leetcode.oo.stacks;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://leetcode.com/problems/process-tasks-using-servers/
public final class ProcessServers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProcessServers().assignTasks(
            new int[]{3, 3, 2},
            new int[]{1, 2, 3, 2, 1, 2}
        )));
    }

    public int[] assignTasks(final int[] servers, final int[] tasks) {
        PriorityQueue<int[]> freeServers = new PriorityQueue<>((a, b) -> (a[0] != b[0]) ? (a[0] - b[0]) : (a[1] - b[1]));
        PriorityQueue<int[]> usedQueue = new PriorityQueue<>((a, b)->(a[2] != b[2]) ? (a[2] - b[2]) : ((a[0] != b[0]) ? (a[0] - b[0]) : (a[1] - b[1])));
        int n = servers.length;
        int m = tasks.length;
        //O(nLogn)
        for (int i = 0; i < n; i++) {
            freeServers.add(new int[] {servers[i], i, 0});
        }
        int[] res = new int[m];
        //O(m * Logn)
        for (int i = 0; i < m; i++) {
            int t = tasks[i];
            while (!usedQueue.isEmpty() && usedQueue.peek()[2] <= i) {
                freeServers.add(usedQueue.poll());
            }
            //If there is no free servers now, we can find the used server with smallest available time
            if (freeServers.isEmpty()) {
                int[] cur = usedQueue.poll();
                res[i] = cur[1];
                cur[2] += t;
                usedQueue.add(cur);
            } else {
                int[] cur = freeServers.poll();
                res[i] = cur[1];
                cur[2] = i + t;
                usedQueue.add(cur);
            }
        }
        return res;
    }
}
