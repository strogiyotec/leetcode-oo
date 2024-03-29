package leetcode.oo.stacks;

import java.util.Arrays;
import java.util.Comparator;
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
        final PriorityQueue<Server> freeServers = new PriorityQueue<>(Comparator.comparing(s -> s.weight));
        final PriorityQueue<Server> usedServers = new PriorityQueue<>(Comparator.comparing(s -> s.availableTime));
        for (int i = 0; i < servers.length; i++) {
            freeServers.add(new Server(i, servers[i], 0));
        }
        final int[] assignedTasks = new int[tasks.length];
        for (int second = 0; second < tasks.length; second++) {
            while (!usedServers.isEmpty() && usedServers.peek().availableTime <= second) {
                final Server used = usedServers.poll();
                freeServers.add(
                    new Server(used.index, used.weight, 0)
                );
            }
            final Server free = freeServers.poll();
            assignedTasks[second] = free.index;
            usedServers.add(
                new Server(
                    free.index,
                    free.weight,
                    tasks[second] + second
                )
            );
        }
        return assignedTasks;
    }

    @SuppressWarnings("ALL")
    static class Server {

        final int index;
        final int weight;
        int availableTime;

        public Server(final int index, final int weight, final int availableTime) {
            this.index = index;
            this.weight = weight;
            this.availableTime = availableTime;
        }
    }
}
